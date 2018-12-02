package creational.factory_method.entity;

public class Car implements Machine {


    @Override
    public String move() {
        return "I'm moving on the ground";
    }

    @Override
    public Double volumeOfFuelTank() {
        return 40.4;
    }
}
