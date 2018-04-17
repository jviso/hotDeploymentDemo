import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

import static org.junit.Assert.assertNotNull;

public class ClientTest {

    @Test
    public void clientCanBeCreatedWithClassLoaderAndDisplayDependencies() throws MalformedURLException {
        URL[] urls = new URL[]{new URL("file:///./serverDouble")};
        Client client = new Client(new URLClassLoader(urls), new ClientDisplay());
        assertNotNull(client);
    }

}
