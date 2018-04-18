public class Client {

    private ClassLoader urlClassLoader;
    private DisplayInterface display;
    private ServerInterface server;

    public Client(ClassLoader urlClassLoader, DisplayInterface display) {
        this.urlClassLoader = urlClassLoader;
        this.display = display;
    }

    public void run() throws Exception {
        server = (ServerInterface) urlClassLoader.loadClass("Server").newInstance();
        String message = server.getMessage();
        display.printMessage(message);
    }
}
