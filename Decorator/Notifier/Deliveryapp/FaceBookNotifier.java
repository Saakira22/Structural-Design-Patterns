package Notifier.Deliveryapp;

import Notifier.Decorator.DatabaseService;

public class FaceBookNotifier extends Notifier {
    
    public FaceBookNotifier(String username, DatabaseService databaseService) {
        super(username, databaseService);
    }




    @Override
    public void send(String msg) {
        String FBname=databaseService.get_FBname_FromUsername(getUsername());
        System.out.println("Sending "+msg+" by FaceBook to "+ FBname);
    }
    }

    

