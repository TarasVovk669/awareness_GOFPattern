package creational.factory_method.creator;

import creational.factory_method.entity.Machine;

public abstract class MachineCreator {

    public abstract Machine createMachine();

    public String typeOfMove() {
        Machine machine = createMachine();
        return machine.move();
    }

    public Double getVolumeOfTank() {
        Machine machine = createMachine();
        return machine.volumeOfFuelTank();
    }
}
