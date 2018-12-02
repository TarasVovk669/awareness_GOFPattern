package creational.factory_method.entity;

import creational.factory_method.entity.Machine;

public class Ship implements Machine {
    @Override
    public String move() {
        return "I'm moving along the water";
    }

    @Override
    public Double volumeOfFuelTank() {
        return 1000.1;
    }
}
