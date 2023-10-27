package task3;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PaymentProvider paymentProvider = new PaymentProvider() {
            @Override
            public boolean processPayment(String cardNo, double amount) {
                return false;
            }

            @Override
            public char[] processPayment(Object price) {
                return new char[0];
            }
        };

        ScheduleProvider scheduleProvider = new ScheduleProvider() {
            @Override
            public void updateSchedule(Schedule schedule) {
                // Реализация обновления расписания
            }

            @Override
            public List<Bus> getBusSchedule(Date date) {
                // Реализация получения расписания автобусов для заданной даты
                return null;
            }
        };

        AuthenticationProvider authenticationProvider = new AuthenticationProvider() {
            @Override
            public User getUser(String username) {
                // Реализация получения пользователя по имени пользователя
                return null;
            }

            @Override
            public boolean isUserAuthenticated(String username, String password) {
                // Реализация проверки аутентификации пользователя
                return false;
            }
        };

        // Создание новых билетов
        BusTicket ticket1 = new BusTicket(1, "John Doe", "Company1", "CityA", "CityB", 10.0);
        BusTicket ticket2 = new BusTicket(2, "Jane Smith", "Company2", "CityB", "CityC", 15.0);

        // Создание TicketProvider
        TicketProvider ticketProvider = new TicketProvider(paymentProvider, scheduleProvider, authenticationProvider);

        // Добавление билетов в TicketProvider
        ticketProvider.addTicket(ticket1);
        ticketProvider.addTicket(ticket2);

        String source = "Source City";
        String destination = "Destination City";
        Date date = new Date();
        String username = "yourUsername";
        String password = "yourPassword";

        // Поиск доступных билетов
        List<BusTicket> availableTickets = ticketProvider.searchTickets(source, destination, date, username, password);
        System.out.println("Найдены доступные билеты:");
        for (BusTicket ticket : availableTickets) {
            ticket.printTicketDetails();
        }

        // Покупка билета
        if (!availableTickets.isEmpty()) {
            BusTicket selectedTicket = availableTickets.get(0);
            String purchaseResult = ticketProvider.buyTicket(selectedTicket, username, password);
            System.out.println(purchaseResult);
        }
    }
}