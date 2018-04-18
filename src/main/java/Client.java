import java.net.URLClassLoader;

public class Client {

    private ClassLoader urlClassLoader;
    private ClientDisplay clientDisplay;
    private ServerInterface server;

    public Client(ClassLoader urlClassLoader, ClientDisplay clientDisplay) {
        this.urlClassLoader = urlClassLoader;
        this.clientDisplay = clientDisplay;
    }

    public void run() throws Exception {
        server = (ServerInterface) urlClassLoader.loadClass("Server").newInstance();
        String message = server.getMessage();
    }
}
