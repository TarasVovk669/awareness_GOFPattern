package behavioral.mediator.engine;

import java.util.ArrayList;
import java.util.List;

public class ConcreteChat implements Chat {
    private User admin;
    private List<User> users = new ArrayList<>();

    public User getAdmin() {
        return admin;
    }

    public void setAdmin(User admin) {
        if (admin instanceof Admin) {
            this.admin = admin;
        } else {
            throw new RuntimeException("403 Forbidden");
        }

    }

    public void addUser(User u) {
        if (u instanceof ChatUser) {
            users.add(u);
        } else {
            throw new RuntimeException("error for adding user in chat");
        }
    }

    @Override
    public void sendMessage(User u, String message) {
        if(u instanceof Admin){
            users.forEach(user -> user.getMessage(user.getName()+": "+message));
        }
        if (u instanceof ChatUser){
            users.forEach(user->{
                if(u!=user && user.isActive()){
                    user.getMessage(user.getName()+": "+message);
                }
            });
            if(admin.isActive()){
                admin.getMessage(u.getName()+": "+message);
            }
        }

    }
}
