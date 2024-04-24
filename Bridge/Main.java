public class Main {
    public static void main(String[] args) {
        MessagingService emailService = new EmailService();
        MessagingService smsService = new SMSService();

        Message emailMessage = new EmailMessage(emailService);
        Message smsMessage = new SMSMessage(smsService);

        emailMessage.send("example@example.com", "Hello, this is an email message!");
        smsMessage.send("1234567890", "Hello, this is an SMS message!");
    }
}
