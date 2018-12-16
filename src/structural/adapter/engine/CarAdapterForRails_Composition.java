package structural.adapter.engine;

public class CarAdapterForRails_Composition implements TrainRails {
    private Car car;

    public CarAdapterForRails_Composition() {
        car = new Car();
    }

    @Override
    public void rideOnRails() {
        System.out.println(car.rideOnWheels());
    }

    @Override
    public void makeCHUH_CHUH() {
        System.out.println(car.makeBipBip());
    }
}
