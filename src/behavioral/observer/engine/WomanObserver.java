package behavioral.observer.engine;

public class WomanObserver implements Observer {
    private String name;

    public WomanObserver(String name) {
        this.name = name;
    }

    @Override
    public void getUpdate(String title, Integer number, Integer qtyOfPages) {
        System.out.println("Woman with name: " + name + " received a message about the new number of Magazine: ["
                + title + " | " + number + " | " + qtyOfPages + " ]");
    }
}
