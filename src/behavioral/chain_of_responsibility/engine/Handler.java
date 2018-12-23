package behavioral.chain_of_responsibility.engine;

public abstract class Handler {
    private Handler next;

    public Handler link(Handler next) {
        this.next = next;
        return next;
    }

    public abstract boolean check(String login, String password);


    public boolean checkNext(String login, String password) {
        if (next == null) {
            return true;
        }
        return next.check(login, password);
    }
}
