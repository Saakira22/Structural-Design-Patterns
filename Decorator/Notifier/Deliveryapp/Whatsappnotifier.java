package Notifier.Deliveryapp;

import Notifier.Decorator.DatabaseService;

public class Whatsappnotifier extends Notifier {
    
    


    public Whatsappnotifier(String username, DatabaseService databaseService) {
        super(username, databaseService);
    }




    @Override
    public void send(String msg) {
        String phone_no=databaseService.get_Phoneno_FromUsername(getUsername());
        System.out.println("Sending "+msg+" by WhatsApp to "+ phone_no);
    }
    
    
}
