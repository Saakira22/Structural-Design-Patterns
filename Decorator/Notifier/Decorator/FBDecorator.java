package Notifier.Decorator;


public class FBDecorator extends BaseNotifierDecorator {
    

    public FBDecorator(INotifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String message) {
        super.send(message);
        String FBname=databaseService.get_FBname_FromUsername(getUsername());
        System.out.println("Sending "+message+" by FaceBook to "+ FBname); 
    }

    
    
    

    

    
}
