public class SMSMessage implements Message {
    
    private final MessagingService messagingService;

    public SMSMessage(MessagingService messagingService) {
        this.messagingService = messagingService;
    }

    @Override
    public void send(String to, String content) {
        messagingService.sendMessage(to, content);
    }
    
}
