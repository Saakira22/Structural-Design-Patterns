package Notifier.Decorator;

public class DatabaseService {
    public String getMailFromUsername(String username){
        return username + "@Mail";
    }

    public String get_Phoneno_FromUsername(String username){
        return username+"@Phone";
    }

    public String get_FBname_FromUsername(String username){
        return username+"@Facebook";
    }
    
}
