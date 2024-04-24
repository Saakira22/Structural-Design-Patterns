public class SMSService implements MessagingService {

    @Override
    public void sendMessage(String to, String content) {
        System.out.println("Sending SMS to: " + to + ", Content: " + content);
    }
    
}
