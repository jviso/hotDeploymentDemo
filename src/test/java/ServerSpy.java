public class ServerSpy extends Server {

    private static boolean messageWasCalled;

    public static boolean getMessageWasCalled() {
        return messageWasCalled;
    }

    public String getMessage() {
        messageWasCalled = true;
        return "spy message";
    }
}
