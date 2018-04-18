public class ClassLoaderDouble extends ClassLoader {

    @Override
    public Class loadClass(String name, boolean test) throws ClassNotFoundException {
//        if (Server.class.getName().equals(name)) {
           return ServerSpy.class;
//        } else {
//            return Class.forName(name);
//        }
    }

}
