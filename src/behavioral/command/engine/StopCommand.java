package behavioral.command.engine;


public class StopCommand implements Command {
    private CarReceiver carReceiver;

    public StopCommand(CarReceiver carReceiver) {
        this.carReceiver = carReceiver;
    }

    @Override
    public void execute() {
        System.out.println(carReceiver.getStopCommand());
    }
}
