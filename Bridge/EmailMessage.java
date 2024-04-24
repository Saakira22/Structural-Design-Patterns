public class EmailMessage implements Message{
    
    private final MessagingService messagingService;

    public EmailMessage(MessagingService messagingService) {
        this.messagingService = messagingService;
    }

    @Override
    public void send(String to, String content) {
        messagingService.sendMessage(to, content);
    }

}
