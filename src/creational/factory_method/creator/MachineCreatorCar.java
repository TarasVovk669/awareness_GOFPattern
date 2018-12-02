package creational.factory_method.creator;

import creational.factory_method.entity.Car;
import creational.factory_method.entity.Machine;

public class MachineCreatorCar  extends  MachineCreator{

    @Override
    public Machine createMachine() {
        return new Car();
    }
}
