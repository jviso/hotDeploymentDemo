public class FakeClassLoader extends ClassLoader {

    @Override
    public Class loadClass(String name, boolean test) throws ClassNotFoundException {
        return ServerSpy.class;
   }

}
