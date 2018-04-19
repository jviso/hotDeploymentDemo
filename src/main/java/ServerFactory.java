public class ServerFactory implements ServerFactoryInterface {

    @Override
    public ServerInterface getCurrentServer() {
        return new Server();
    }
}
