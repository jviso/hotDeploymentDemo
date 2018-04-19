public class FakeServerFactory implements ServerFactoryInterface {

    @Override
    public ServerInterface getCurrentServer() {
        return new ServerSpy();
    }
}
