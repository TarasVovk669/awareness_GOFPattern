package structural.decorator.engine;

public class SMSNotificator implements Notificator {

    private Notificator notificator;

    private static final String smsText = "Send message in SMS.";

    public SMSNotificator(Notificator notificator) {
        this.notificator = notificator;
    }

    @Override
    public String sendMessage() {
        return notificator.sendMessage()
                .concat("\n")
                .concat(smsText);
    }
}
