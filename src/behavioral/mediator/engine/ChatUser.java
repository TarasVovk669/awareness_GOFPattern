package behavioral.mediator.engine;

public class ChatUser extends User {

    public ChatUser(String name, Chat chat, boolean isActive) {
        super(name, chat, isActive);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("User: " + getName() + " get message: [" + message + "]");
    }
}
