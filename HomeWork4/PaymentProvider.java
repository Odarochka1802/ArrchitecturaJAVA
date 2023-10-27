package task3;

public interface PaymentProvider {
    boolean processPayment(String cardNo, double amount);

    char[] processPayment(Object price);
}

