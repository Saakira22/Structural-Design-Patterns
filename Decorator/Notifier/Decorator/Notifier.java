package Notifier.Decorator;

public class Notifier implements INotifier {
    private final String username;
    private final DatabaseService databaseService;

    //Constructor
    public Notifier(String username) {
        this.username = username;
        databaseService = new DatabaseService();
    }

    //Getter for Username
    @Override
    public String getUsername() {
        return username;
    }

    //send by mail
    @Override
    public void send(String message) {
        String mail=databaseService.getMailFromUsername(username);
        System.out.println("Sending "+message+" by Mail to "+mail);
    }


   
    
    
}
