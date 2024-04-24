package Notifier.Deliveryapp;

import Notifier.Decorator.DatabaseService;

public class Notifier {
    private final String username;
    DatabaseService databaseService;

    //Constructor
    public Notifier(String username, DatabaseService databaseService) {
        this.username = username;
        this.databaseService = databaseService;
    }


    //Getter for username
    public String getUsername() {
        return username;
    }


    //SEND method
    public void send(String msg){
        String mail=databaseService.getMailFromUsername(username);
        System.out.println("Sending "+msg+" by Mail to "+mail);
     }
    
    
    
}
