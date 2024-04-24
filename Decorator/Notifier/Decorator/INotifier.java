package Notifier.Decorator;

public interface INotifier {
    void send(String message);
    String getUsername();
}
