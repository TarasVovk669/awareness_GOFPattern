package creational.singleton;

public class MultiThreadDataBaseSingleton {
    private static volatile MultiThreadDataBaseSingleton instance;

    private MultiThreadDataBaseSingleton(){

    }

    public static MultiThreadDataBaseSingleton getInstance(){
        if(instance == null) {
            synchronized (MultiThreadDataBaseSingleton.class) {
                instance = new MultiThreadDataBaseSingleton();
            }
        }
        return instance;
    }

}
