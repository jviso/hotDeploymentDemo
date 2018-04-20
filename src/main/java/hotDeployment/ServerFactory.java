package hotDeployment;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class ServerFactory implements ServerFactoryInterface {

    @Override
    public ServerInterface getCurrentServer() {
        try {
            URL urlFromFile = new File("/Users/jvisovatti/IdeaProjects/hotDeploymentDemo/serverclass").toURI().toURL();
            URL[] urls = new URL[]{urlFromFile};
            ClassLoader urlClassLoader = new URLClassLoader(urls, getClass().getClassLoader());
            ServerInterface server = (ServerInterface) urlClassLoader.loadClass("server.Server").newInstance();
            return server;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
