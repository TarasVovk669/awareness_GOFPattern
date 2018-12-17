package structural.decorator.engine;

public class MainEngine {
    public static void main(String[] args) {
        String error = "--critical memory error on server!!!";
        String warning = "--internet security warning!";
        String info = "--info about server workflow";

        //when error on server

        Notificator errorNotificator =
                new SMSNotificator(
                        new FacebookNotificator(
                                new TelegramNotificator(
                                        new TextNotificator(error))));

        //when warning on server
        Notificator warningNotificator =
                new FacebookNotificator(
                        new TelegramNotificator(
                                new TextNotificator(warning)));

        //info about workflow
        Notificator infoNotificator =
                new TelegramNotificator(
                        new TextNotificator(info));

        System.out.println(errorNotificator.sendMessage());
        System.out.println(warningNotificator.sendMessage());
        System.out.println(infoNotificator.sendMessage());
    }
}
