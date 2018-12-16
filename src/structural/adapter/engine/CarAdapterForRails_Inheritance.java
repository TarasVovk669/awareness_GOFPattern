package structural.adapter.engine;

public class CarAdapterForRails_Inheritance extends Car implements TrainRails {
    @Override
    public void rideOnRails() {
        System.out.println(super.rideOnWheels());
    }

    @Override
    public void makeCHUH_CHUH() {
        System.out.println(super.makeBipBip());
    }
}
