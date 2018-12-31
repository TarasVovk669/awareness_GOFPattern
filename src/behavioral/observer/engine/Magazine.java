package behavioral.observer.engine;

import java.util.ArrayList;
import java.util.List;

public class Magazine implements Publisher {
    private List<Observer> subscribers = new ArrayList<>();
    private String title;
    private Integer number;
    private Integer qtyOfPages;

    public void publishNewNumberOfMagazine(String title, Integer number, Integer qtyOfPages) {
        this.title = title;
        this.number = number;
        this.qtyOfPages = qtyOfPages;
        notifySubscribers();
    }

    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        subscribers.forEach(s -> {
            s.getUpdate(title, number, qtyOfPages);
        });
    }
}
