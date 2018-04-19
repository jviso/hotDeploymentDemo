public class Client {

    private ServerFactoryInterface serverFactory;
    private DisplayInterface display;
    private ServerInterface server;

    public Client(ServerFactoryInterface serverFactory, DisplayInterface display) {
        this.serverFactory = serverFactory;
        this.display = display;
    }

    public void run() {
        server = serverFactory.getCurrentServer();
        String message = server.getMessage();
        display.printMessage(message);
    }
}
