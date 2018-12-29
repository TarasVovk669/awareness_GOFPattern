package behavioral.mediator.engine;

import behavioral.mediator.engine.Chat;

public abstract class User {
    private String name;
    private Chat chat;
    private boolean isActive;


    public User(String name, Chat chat, boolean isActive) {
        this.name = name;
        this.chat = chat;
        this.isActive = isActive;
    }

    public void sendMessage(String message) {
        chat.sendMessage(this, message);
    }

    public abstract void getMessage(String message);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
