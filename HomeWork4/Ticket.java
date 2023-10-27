package task3;


public abstract class Ticket {
    private int ticketNumber;
    private String passengerName;

    public Ticket(int ticketNumber, String passengerName) {
        this.ticketNumber = ticketNumber;
        this.passengerName = passengerName;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public abstract double calculatePrice();

    public abstract void printTicketDetails();

    public abstract boolean isAvailable();

    public abstract void purchase();

    public abstract double getPrice();
}