package structural.decorator.engine;


public class TextNotificator implements Notificator {

    private String text;

    public TextNotificator(String text) {
        this.text = text;
    }

    @Override
    public String sendMessage() {
        return text;
    }
}
