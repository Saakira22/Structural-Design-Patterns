public class EmailService implements MessagingService {

    @Override
    public void sendMessage(String to, String content) {
        System.out.println("Sending email to: " + to + ", Content: " + content);
    }
    
}
