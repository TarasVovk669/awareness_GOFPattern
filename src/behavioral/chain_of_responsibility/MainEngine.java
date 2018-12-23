package behavioral.chain_of_responsibility;

import behavioral.chain_of_responsibility.engine.CheckRoleHandler;
import behavioral.chain_of_responsibility.engine.Handler;
import behavioral.chain_of_responsibility.engine.Server;
import behavioral.chain_of_responsibility.engine.UserExistsHandler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainEngine {
    private static Server server;
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void init() {
        server = new Server();
        server.signUp("admin@admin.com", "123");
        server.signUp("user@admin.com", "321");

        Handler handler = new UserExistsHandler(server);
        handler.link(new CheckRoleHandler());

        server.setHandler(handler);
    }

    public static void main(String[] args) throws IOException {
        init();
        boolean success;
        do {
            System.out.print("Enter login(email): ");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }

}
