package creational.factory_method.creator;

import creational.factory_method.entity.Machine;
import creational.factory_method.entity.Ship;

public class MachineCreatorShip extends MachineCreator {

    @Override
    public Machine createMachine() {
        return new Ship();
    }
}
