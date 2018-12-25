package behavioral.command;

import behavioral.command.engine.*;

public class MainEngine {

    public static void main(String[] args) {
        DriverInvoker driverInvoker = new DriverInvoker();
        CarReceiver carReceiver = new CarReceiver("Lastochka");

        driverInvoker.executeCommand(new DriveCommand(carReceiver));
        driverInvoker.executeCommand(new ForsageCommand(carReceiver));
        driverInvoker.executeCommand(new StopCommand(carReceiver));

    }


}
