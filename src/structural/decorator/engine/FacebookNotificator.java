package structural.decorator.engine;

public class FacebookNotificator implements Notificator {

    private Notificator notificator;

    private static final String facebookNotificator = "Send message in Facebook.";

    public FacebookNotificator(Notificator notificator) {
        this.notificator = notificator;
    }

    @Override
    public String sendMessage() {
        return notificator.sendMessage()
                .concat("\n")
                .concat(facebookNotificator);
    }
}
