import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ClientTest {

    @Test
    public void clientCanBeCreatedWithClassLoaderAndDisplayDependencies() throws MalformedURLException {
        URL[] urls = new URL[]{new URL("file:///./serverDouble")};

        Client client = new Client(new URLClassLoader(urls), new Display());

        assertNotNull(client);
    }

    @Test
    public void whenClientNeedsMessageThenItRequestsMessageFromServer() throws Exception {
        FakeClassLoader fakeClassLoader = new FakeClassLoader();
        Client client = new Client(fakeClassLoader, new Display());

        client.run();

        boolean getMessageWasCalled = ServerSpy.getMessageWasCalled();
        assertTrue(getMessageWasCalled);
    }

    @Test
    public void clientCanPrintMessage() throws Exception {
        ClientDisplaySpy clientDisplaySpy = new ClientDisplaySpy();
        FakeClassLoader fakeClassLoader = new FakeClassLoader();
        Client client = new Client(fakeClassLoader, clientDisplaySpy);

        client.run();

        boolean printMessageWasCalled = clientDisplaySpy.getPrintMessageWasCalled();
        assertTrue(printMessageWasCalled);
    }

}
