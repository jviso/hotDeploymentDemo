import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ServerTest {

    @Test
    public void whenClientRequestsMessageThenServerReturnsMessage() {
        ServerInterface server = new Server();
        assertNotNull(server.getMessage());
    }

}
