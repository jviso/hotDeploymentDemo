import hotDeployment.ServerFactory;
import hotDeployment.ServerInterface;
import org.junit.Test;

import static org.junit.Assert.*;

public class ServerFactoryTest {

    @Test
    public void serverFactoryCanGetAServer() {
        ServerFactory serverFactory = new ServerFactory();

        ServerInterface server = serverFactory.getCurrentServer();

        assertNotNull(server);
    }

    @Test
    public void givenOneServerRequestCompletedWhenAnotherServerIsRequestedThenTheServerClassesAreNotEqual() {
        ServerFactory serverFactory = new ServerFactory();

        ServerInterface firstServer = serverFactory.getCurrentServer();
        ServerInterface secondServer = serverFactory.getCurrentServer();

        assertNotEquals(firstServer.getClass(), secondServer.getClass());
    }

}
