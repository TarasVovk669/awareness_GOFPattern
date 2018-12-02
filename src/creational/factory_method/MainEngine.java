package creational.factory_method;

import creational.factory_method.creator.MachineCreator;
import creational.factory_method.creator.MachineCreatorCar;
import creational.factory_method.creator.MachineCreatorShip;

public class MainEngine {

    public static void main(String[] args) {
        runBusinessLogic(createMachineCreator());
    }

    private static MachineCreator createMachineCreator() {
        createSystemProperty();
        if (System.getProperty("machine.name").equalsIgnoreCase("Car")) {
            return new MachineCreatorCar();
        } else {
            return new MachineCreatorShip();
        }
    }

    private static void runBusinessLogic(MachineCreator machineCreator) {
        System.out.println("Type of move: " + machineCreator.typeOfMove());
        System.out.println("Volume Of Fuel Tank: " + machineCreator.getVolumeOfTank());
    }

    private static void createSystemProperty() {
        //create property
        System.setProperty("machine.name", "ship");
    }
}
