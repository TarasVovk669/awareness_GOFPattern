package behavioral.command.engine;

public class CarReceiver {
private String carName;

    public CarReceiver(String carName) {
        this.carName = carName;
    }

    public String getStopCommand(){
        return "Stop car - "+ carName;
    }

    public String getDriveCommand(){
        return "Drive car - "+ carName;
    }

    public String getForsageCommand(){
        return "FORSSSAGEEEE!!! - "+ carName;
    }
}
