import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ClientTest {

    @Test
    public void clientCanBeCreatedWithServerFactoryAndDisplayDependencies() {
        Client client = new Client(new FakeServerFactory(), new Display());

        assertNotNull(client);
    }

    @Test
    public void whenClientNeedsMessageThenItRequestsMessageFromServer() throws Exception {
        Client client = new Client(new FakeServerFactory(), new Display());

        client.run();

        boolean getMessageWasCalled = ServerSpy.getMessageWasCalled();
        assertTrue(getMessageWasCalled);
    }

    @Test
    public void clientCanPrintMessage() throws Exception {
        ClientDisplaySpy clientDisplaySpy = new ClientDisplaySpy();
        Client client = new Client(new FakeServerFactory(), clientDisplaySpy);

        client.run();

        boolean printMessageWasCalled = clientDisplaySpy.getPrintMessageWasCalled();
        assertTrue(printMessageWasCalled);
    }
}
