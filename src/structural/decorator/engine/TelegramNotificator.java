package structural.decorator.engine;

public class TelegramNotificator implements Notificator {

    private Notificator notificator;

    private static final String telegramText = "Send message in Telegram.";

    public TelegramNotificator(Notificator notificator) {
        this.notificator = notificator;
    }

    @Override
    public String sendMessage() {
        return notificator.sendMessage()
                .concat("\n")
                .concat(telegramText);
    }
}
