package behavioral.command.engine;

public class ForsageCommand implements Command{
    private CarReceiver carReceiver;

    public ForsageCommand(CarReceiver carReceiver) {
        this.carReceiver = carReceiver;
    }

    @Override
    public void execute() {
        System.out.println(carReceiver.getForsageCommand());
    }
}
