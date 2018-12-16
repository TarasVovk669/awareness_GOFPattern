package structural.bridge;

import structural.bridge.abstraction.CarType;
import structural.bridge.abstraction.Coupe;
import structural.bridge.abstraction.Pickup;
import structural.bridge.abstraction.Sedan;
import structural.bridge.implementation.Audi;
import structural.bridge.implementation.BMW;
import structural.bridge.implementation.Mersedes;

public class MainEngine {

    public static void main(String[] args) {
        CarType carCoupe = new Coupe(new Audi());
        System.out.println(carCoupe.getInfo());

        CarType carPickup = new Pickup(new BMW());
        System.out.println(carPickup.getInfo());

        CarType carSedan = new Sedan(new Mersedes());
        System.out.println(carSedan.getInfo());
    }


}
