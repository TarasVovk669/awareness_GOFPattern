package creational.abstract_factory;

import creational.abstract_factory.factory.MacOSFactory;
import creational.abstract_factory.factory.WindowsFactory;

public class Main {

    public static void main(String[] args) {
        Engine engine = configure();
        engine.doAction();
    }

    private static Engine configure() {
        String osName = System.getProperty("os.name");

        if (osName.equalsIgnoreCase("Mac OS X")) {
            return new Engine(new MacOSFactory());
        } else {
            return new Engine(new WindowsFactory());
        }
    }
}
