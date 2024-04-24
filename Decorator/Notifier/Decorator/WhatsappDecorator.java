package Notifier.Decorator;

public class WhatsappDecorator extends BaseNotifierDecorator{
    

    public WhatsappDecorator(INotifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String message) {
        super.send(message);
        String phone_no=databaseService.get_Phoneno_FromUsername(getUsername());
        System.out.println("Sending "+message+" by WhatsApp to "+ phone_no);
    }

    

}
