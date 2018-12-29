package behavioral.mediator;

import behavioral.mediator.engine.*;

public class MainEngine {

    public static void main(String[] args) {

        ConcreteChat chat = new ConcreteChat();

        User admin = new Admin("San Sanich", chat, true);
        User userTaras = new ChatUser("Taras", chat, true);
        User userPetya = new ChatUser("Petya", chat, true);
        User userIvan = new ChatUser("Ivan", chat, true);
        User userLada = new ChatUser("Lada", chat, false);

        chat.setAdmin(admin);
        chat.addUser(userTaras);
        chat.addUser(userIvan);
        chat.addUser(userPetya);
        chat.addUser(userLada);

        userTaras.sendMessage("Hello all!");
        userIvan.sendMessage("Hello Taras");
    }
}
