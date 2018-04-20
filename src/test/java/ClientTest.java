import hotDeployment.Client;
import hotDeployment.TextDisplay;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ClientTest {

    @Test
    public void clientCanBeCreatedWithServerFactoryAndDisplayDependencies() {
        Client client = new Client(new FakeServerFactory(), new TextDisplay());

        assertNotNull(client);
    }

    @Test
    public void whenClientNeedsMessageThenItRequestsMessageFromServer() {
        Client client = new Client(new FakeServerFactory(), new TextDisplay());

        client.run();

        boolean getMessageWasCalled = ServerSpy.getMessageWasCalled();
        assertTrue(getMessageWasCalled);
    }

    @Test
    public void clientCanPrintMessage() {
        DisplaySpy displaySpy = new DisplaySpy();
        Client client = new Client(new FakeServerFactory(), displaySpy);

        client.run();

        boolean printMessageWasCalled = displaySpy.getPrintMessageWasCalled();
        assertTrue(printMessageWasCalled);
    }

    @Test
    public void clientCanReloadServer() {
        FakeServerFactory fakeServerFactory = new FakeServerFactory();
        Client client = new Client(fakeServerFactory, new DisplaySpy());

        client.loadNewServer();

        boolean getCurrentServerWasCalled = fakeServerFactory.getCurrentServerWasCalled();
        assertTrue(getCurrentServerWasCalled);
    }

}
