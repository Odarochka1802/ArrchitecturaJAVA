package task3;

public class BusTicket extends Ticket {
    private String busCompany;
    private String departureCity;
    private String arrivalCity;
    private double fare;

    public BusTicket(int ticketNumber, String passengerName, String busCompany, String departureCity, String arrivalCity, double fare) {
        super(ticketNumber, passengerName);
        this.busCompany = busCompany;
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.fare = fare;
    }

    public BusTicket(Bus bus) {
        super(bus.getTicketNumber(), bus.getPassengerName());
        this.busCompany = bus.getBusCompany();
        this.departureCity = bus.getDepartureCity();
        this.arrivalCity = bus.getArrivalCity();
        this.fare = bus.getFare();
    }

    public String getBusCompany() {
        return busCompany;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public double getFare() {
        return fare;
    }

    @Override
    public double calculatePrice() {
        return fare;
    }

    @Override
    public void printTicketDetails() {
        System.out.println("Bus Ticket Details:");
        System.out.println("Ticket Number: " + getTicketNumber());
        System.out.println("Passenger Name: " + getPassengerName());
        System.out.println("Bus Company: " + getBusCompany());
        System.out.println("Departure City: " + getDepartureCity());
        System.out.println("Arrival City: " + getArrivalCity());
        System.out.println("Fare: " + getFare());
    }

    @Override
    public boolean isAvailable() {
        // Реализация проверки доступности билета
        // Например, проверка по наличию свободных мест на автобусе и другим правилам
        return true;
    }

    @Override
    public void purchase() {
        // Реализация покупки билета
        // Например, установка флага "куплен" или другие операции
    }

    @Override
    public double getPrice() {
        return fare;
    }
}
