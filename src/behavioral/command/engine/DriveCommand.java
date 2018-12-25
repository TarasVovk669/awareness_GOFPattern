package behavioral.command.engine;

public class DriveCommand implements Command {
    private CarReceiver carReceiver;

    public DriveCommand(CarReceiver carReceiver) {
        this.carReceiver = carReceiver;
    }

    @Override
    public void execute() {
        System.out.println(carReceiver.getDriveCommand());
    }
}
