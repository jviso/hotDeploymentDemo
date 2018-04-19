import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ServerFactoryTest {

    @Test
    public void serverFactoryCanGetAServer() {
        ServerFactory serverFactory = new ServerFactory();

        ServerInterface server = serverFactory.getCurrentServer();

        assertNotNull(server);
    }

}
