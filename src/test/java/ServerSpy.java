import hotDeployment.ServerInterface;

public class ServerSpy implements ServerInterface {

    private static boolean messageWasCalled;

    public static boolean getMessageWasCalled() {
        return messageWasCalled;
    }

    public String getMessage() {
        messageWasCalled = true;
        return "spy message";
    }
}
