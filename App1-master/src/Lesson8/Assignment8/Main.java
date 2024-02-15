package lesson8.Assignment8;

public class Main {
    public static void main(String[] args) {
        PayPal paypal = new PayPal();
        Stripe stripe = new Stripe();

        double amount = 100.00;

        paypal.processPayment(amount);
        if (paypal.isPaymentSuccessful()) {
            System.out.println("Payment through PayPal successful!");
        } else {
            System.out.println("Payment through PayPal failed.");
        }
        System.out.println();

        stripe.processPayment(amount);
        if (stripe.isPaymentSuccessful()) {
            System.out.println("Payment through Stripe successful!");
        } else {
            System.out.println("Payment through Stripe failed.");
        }
    }
}
