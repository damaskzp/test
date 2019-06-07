package ClassLoaders;

import java.lang.reflect.InvocationTargetException;

public class CLMainCreator {
    public static void main(String[] args) throws InterruptedException, ClassNotFoundException,
            IllegalAccessException, InstantiationException,
            NoSuchMethodException, InvocationTargetException {
        while (true) {
            Thread.sleep(1000);
            CLLoader clLoader = new CLLoader();
            Class<?> aClass = Class.forName("ClassLoaders.Cat", true, clLoader);
            aClass.getDeclaredConstructor().newInstance();
        }
    }
}
