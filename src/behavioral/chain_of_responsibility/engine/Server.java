package behavioral.chain_of_responsibility.engine;

import java.util.HashMap;
import java.util.Map;

public class Server {

    private Map<String, String> users = new HashMap<>();
    private Handler handler;

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public boolean logIn(String login, String password) {
        if (handler.check(login, password)) {
            System.out.println("authorized!");
            return true;
        }
        return false;
    }

    public void signUp(String login, String password) {
        users.put(login, password);
    }

    public boolean hasEmail(String login) {
        return users.containsKey(login);
    }

    public boolean isValidPassword(String login, String password) {
        return users.get(login).equals(password);
    }
}
