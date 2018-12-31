package behavioral.observer.engine;

public interface Publisher {

    void subscribe(Observer observer);

    void unsubscribe(Observer observer);

    void notifySubscribers();
}
