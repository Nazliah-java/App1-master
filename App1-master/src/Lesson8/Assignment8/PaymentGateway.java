package lesson8.Assignment8;

public interface PaymentGateway {
    
    void processPayment(double amount);
    boolean isPaymentSuccessful();
}
