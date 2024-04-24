package Notifier.Decorator;

public class sms extends BaseNotifierDecorator {

    public sms(INotifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String message) {
    
        super.send(message);
        String phone_no=databaseService.get_Phoneno_FromUsername(getUsername());
        System.out.println("Sending "+message+" by SMS to "+ phone_no);
    }

    
    
}
