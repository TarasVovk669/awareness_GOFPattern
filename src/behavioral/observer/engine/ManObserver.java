package behavioral.observer.engine;

public class ManObserver implements Observer {
    private String name;

    public ManObserver(String name) {
        this.name = name;
    }

    @Override
    public void getUpdate(String title, Integer number, Integer qtyOfPages) {
        System.out.println("Man with name: " + name + " received a message about the new number of Magazine: ["
                + title + " | " + number + " | " + qtyOfPages + " ]");
    }
}
