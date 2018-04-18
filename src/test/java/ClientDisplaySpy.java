public class ClientDisplaySpy implements DisplayInterface {

    private boolean printMessageWasCalled;

    @Override
    public void printMessage(String message) {
        printMessageWasCalled = true;
    }

    boolean getPrintMessageWasCalled() {
        return printMessageWasCalled;
    }

}
