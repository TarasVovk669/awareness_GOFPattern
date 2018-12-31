package behavioral.observer;

import behavioral.observer.engine.Magazine;
import behavioral.observer.engine.ManObserver;
import behavioral.observer.engine.Observer;
import behavioral.observer.engine.WomanObserver;

public class MainEngine {

    public static void main(String[] args) {
        Magazine magazine = new Magazine();
        Observer taras = new ManObserver("Taras");
        Observer ivan = new ManObserver("Ivan");
        Observer marina = new WomanObserver("Marina");

        magazine.subscribe(taras);
        magazine.subscribe(ivan);
        magazine.subscribe(marina);

        magazine.publishNewNumberOfMagazine("VEDMAK ",1,89);

        magazine.unsubscribe(ivan);
        magazine.notifySubscribers();
    }
}
