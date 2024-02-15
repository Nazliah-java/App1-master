package lesson8.Assignment9;

public class SmsSender implements MessageSender {

    private String phoneNumber;

    public SmsSender(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS to " + phoneNumber + ": " + message);
    }
}
