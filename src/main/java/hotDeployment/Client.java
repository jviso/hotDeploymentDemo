package hotDeployment;

public class Client {

    private ServerFactoryInterface serverFactory;
    private DisplayInterface display;
    private ServerInterface server;

    public Client(ServerFactoryInterface serverFactory, DisplayInterface display) {
        this.serverFactory = serverFactory;
        this.display = display;
    }

    public void run() {
        loadNewServer();
        String message = server.getMessage();
        display.printMessage(message);
    }

    public void loadNewServer() {
        try {
            server = serverFactory.getCurrentServer();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
