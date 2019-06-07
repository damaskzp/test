package ClassLoaders;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class CLLoader extends ClassLoader {
    private static String PATH = "C:\\Users\\Dima Bulat\\Desktop\\1\\Cat.class";

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        Class c = findLoadedClass(name);
        if (c == null) {
            try {
                c = getParent().loadClass(name);
            } catch (ClassNotFoundException e) {
                c = findClass(name);
            }
        }
        return c;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        Class c = null;
        try {
            byte[] fileAsBytes = getFileAsBytes(PATH);
            c = defineClass(name, fileAsBytes, 0, fileAsBytes.length);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return c;
    }

    byte[] getFileAsBytes(String path) throws IOException {
        File file = new File(path);
        byte[] result = new byte[(int) file.length()];
        try (FileInputStream is = new FileInputStream(file)) {
            is.read(result, 0, result.length);
        }
        return result;
    }
}
