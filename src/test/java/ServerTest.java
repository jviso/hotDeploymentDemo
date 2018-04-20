import hotDeployment.ServerInterface;
import org.junit.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

import static org.junit.Assert.assertNotNull;

public class ServerTest {

    @Test
    public void whenClientRequestsMessageThenServerReturnsMessage() {
        ServerInterface server = null;
        try {
            URL urlFromFile = new File("/Users/jvisovatti/IdeaProjects/hotDeploymentDemo/serverclass").toURI().toURL();
            URL[] urls = new URL[]{urlFromFile};
            ClassLoader urlClassLoader = new URLClassLoader(urls, getClass().getClassLoader());
            server = (ServerInterface) urlClassLoader.loadClass("server.Server").newInstance();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        assertNotNull(server.getMessage());
    }

}
