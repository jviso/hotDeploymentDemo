import java.net.URLClassLoader;

public class Client {

    private ClassLoader urlClassLoader;
    private ClientDisplay clientDisplay;

    public Client(ClassLoader urlClassLoader, ClientDisplay clientDisplay) {
        this.urlClassLoader = urlClassLoader;
        this.clientDisplay = clientDisplay;
    }
}
