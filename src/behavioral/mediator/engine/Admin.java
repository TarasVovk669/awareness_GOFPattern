package behavioral.mediator.engine;

public class Admin extends User {

    public Admin(String name, Chat chat, boolean isActive) {
        super(name, chat, isActive);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Admin: " + getName() + " get message: [ " + message + "]");
    }
}
