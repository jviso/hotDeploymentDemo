import hotDeployment.ServerFactoryInterface;
import hotDeployment.ServerInterface;

public class FakeServerFactory implements ServerFactoryInterface {

    private boolean getCurrentServerWasCalled;

    @Override
    public ServerInterface getCurrentServer() {
        getCurrentServerWasCalled = true;
        return new ServerSpy();
    }

    public boolean getCurrentServerWasCalled() {
        return this.getCurrentServerWasCalled;
    }
}
