package Lesson8.Assignment13;

public interface PaymentGateway {
    
    void processPayment(double amount);
    boolean isPaymentSuccessful();
}
