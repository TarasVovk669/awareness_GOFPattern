package behavioral.chain_of_responsibility.engine;

public class CheckRoleHandler extends Handler {
    @Override
    public boolean check(String login, String password) {
        if (login.equals("admin@admin.com")) {
            System.out.println("Hello, admin!");
            return true;
        }
        System.out.println("Hello, user!");
        return checkNext(login, password);
    }
}
