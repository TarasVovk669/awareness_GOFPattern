package creational.singleton;

public class MainEngine {

    public static void main(String[] args) {
        System.out.println("first call: " +DataBaseSingleton.getInstance());
        System.out.println("second call: " +DataBaseSingleton.getInstance());
        System.out.println("third call: " +DataBaseSingleton.getInstance());

        System.out.println("first call multi: " +MultiThreadDataBaseSingleton.getInstance());
        System.out.println("first call multi: " +MultiThreadDataBaseSingleton.getInstance());
        System.out.println("first call multi: " +MultiThreadDataBaseSingleton.getInstance());
    }
}
