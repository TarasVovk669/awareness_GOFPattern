package behavioral.command.engine;

public class DriverInvoker {

    public void executeCommand(Command command){
        command.execute();
    }
}
