package creational.singleton;

public class DataBaseSingleton {
    private static DataBaseSingleton instance;

    private DataBaseSingleton(){

    }

    public static DataBaseSingleton getInstance(){
        if(instance == null){
            instance = new DataBaseSingleton();
        }
        return instance;
    }
}
