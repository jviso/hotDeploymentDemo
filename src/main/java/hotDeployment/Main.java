package hotDeployment;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ServerFactory serverFactory = new ServerFactory();
        TextDisplay display = new TextDisplay();
        Client client = new Client(serverFactory, display);
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            client.run();
            input = scanner.next();
        } while (!(input.equals("q")));
    }

}
