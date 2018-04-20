package server;

import hotDeployment.ServerInterface;

public class Server implements ServerInterface {
    @Override
    public String getMessage() {
        return "changed message";
    }
}
