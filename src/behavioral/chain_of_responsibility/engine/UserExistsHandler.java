package behavioral.chain_of_responsibility.engine;

public class UserExistsHandler extends Handler {
    private Server server;

    public UserExistsHandler(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String login, String password) {
        if (!server.hasEmail(login)) {
            System.out.println("This email is not registered!");
            return false;
        }
        if (!server.isValidPassword(login, password)) {
            System.out.println("Wrong password!");
            return false;
        }
        return checkNext(login, password);

    }
}
