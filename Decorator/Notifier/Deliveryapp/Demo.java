package Notifier.Deliveryapp;

import Notifier.Decorator.DatabaseService;

public class Demo {
    public static void main(String[] args) {
       // Whatsappnotifier notifier = new Whatsappnotifier("saakira", databaseService)
     //   notifier.send("Order received");
     DatabaseService databaseService=new DatabaseService();

     //Notify by email
     Notifier n=new Notifier("ss", databaseService);
     n.send("hello");

     //Notify by Whatsapp
     Whatsappnotifier w=new Whatsappnotifier("xyz", databaseService);
    w.send("Sent");

     //Notify by facebook
     FaceBookNotifier f=new FaceBookNotifier("abc", databaseService);
    f.send("Sent");

    }
    
}
