package lesson8.Assignment9;

public class Main {
    public static void main(String[] args) {
        String message = "Hello!";

        MessageSender emailSender = new EmailSender("nazliah@gmail.com");
        emailSender.sendMessage(message);

        MessageSender smsSender = new SmsSender("011-19788001");
        smsSender.sendMessage(message);
    }
}
