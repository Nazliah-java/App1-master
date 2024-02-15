package lesson8.Assignment9;

public class EmailSender implements MessageSender {

    private String emailAddress;

    public EmailSender(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email to " + emailAddress + ": " + message);
    }
}
