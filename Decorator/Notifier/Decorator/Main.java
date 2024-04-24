package Notifier.Decorator;
public class Main {
public static void main(String[] args) {
    INotifier notifier = new FBDecorator(new WhatsappDecorator(new Notifier("SAAKIRA")));
    notifier.send("Order Dispatched");
    INotifier n= new WhatsappDecorator(new sms(new Notifier("abcd")));
    n.send("activate");

}
    
}