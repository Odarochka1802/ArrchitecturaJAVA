package task3;

import java.util.*;

public class TicketProvider {
    private PaymentProvider paymentProvider;
    private ScheduleProvider scheduleProvider;
    private AuthenticationProvider authenticationProvider;

    public TicketProvider(PaymentProvider paymentProvider, ScheduleProvider scheduleProvider, AuthenticationProvider authenticationProvider) {
        this.paymentProvider = paymentProvider;
        this.scheduleProvider = scheduleProvider;
        this.authenticationProvider = authenticationProvider;
    }

    public List<BusTicket> searchTickets(String source, String destination, Date date, String username, String password) {
        // Проверяем, зарегистрирован ли пользователь
        if (!authenticationProvider.isUserAuthenticated(username, password)) {
            System.out.println("Пользователь не аутентифицирован. Пожалуйста, войдите в систему.");
            return Collections.emptyList();
        }

        // Получаем расписание автобусов
        List<Bus> busSchedule = scheduleProvider.getBusSchedule(date);

        // Ищем доступные билеты на автобус
        List<BusTicket> availableTickets = new ArrayList<>();
        for (Bus bus : busSchedule) {
            if (bus.getSource().equals(source) && bus.getDestination().equals(destination)) {
                availableTickets.add(new BusTicket(bus));
            }
        }

        if (availableTickets.isEmpty()) {
            System.out.println("Извините, билеты на выбранное направление не найдены.");
        }

        return availableTickets;
    }

    public String buyTicket(BusTicket ticket, String username, String password) {
        // Проверяем, зарегистрирован ли пользователь
        if (!authenticationProvider.isUserAuthenticated(username, password)) {
            return "Пользователь не аутентифицирован. Пожалуйста, войдите в систему.";
        }

        // Проверяем доступность билета
        if (!ticket.isAvailable()) {
            return "Извините, выбранный билет уже продан или недоступен.";
        }

        // Обрабатываем платеж
        String paymentStatus = String.valueOf(paymentProvider.processPayment(ticket.getPrice()));

        if (paymentStatus.equals("Success")) {
            // Завершаем покупку билета
            ticket.purchase();

            return "Покупка билета успешно завершена.";
        }

        return "Ошибка при обработке платежа. Пожалуйста, попробуйте позже.";
    }

    public void addTicket(BusTicket ticket1) {
    }
}