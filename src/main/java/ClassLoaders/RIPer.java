package ClassLoaders;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class RIPer {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Field[] fields = ReflexEx.class.getFields();
        for (Field field : fields) {
            Class<?> type = field.getType();
            String name = field.getName();
            System.out.println(type + " " + name);
        }
        System.out.println("          ");
        Field[] declaredFields = ReflexEx.class.getDeclaredFields();
        for (Field field : declaredFields) {
            Class<?> type = field.getType();
            String name = field.getName();
            System.out.println(type + " " + name);
        }
        Field fieldsi = ReflexEx.class.getDeclaredField("i");
        ReflexEx instance = new ReflexEx();
        fieldsi.setAccessible(true);
        int i = fieldsi.getInt(instance);

        System.out.println(i);
        fieldsi.setInt(instance, 21);
        System.out.println(instance.getI());

        Method[] methods = ReflexEx.class.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Methods!!!");
            System.out.println("name: " + method.getName());
            System.out.println("Return type: " + method.getReturnType());
            System.out.println(Arrays.toString(method.getParameters()));
            System.out.println(Object.class.getSuperclass());

            Method getStrField = ReflexEx.class.getDeclaredMethod("getStr", String.class);
            getStrField.setAccessible(true);
            Object result = getStrField.invoke(instance, "111");
            System.out.println(result);
            System.out.println(result.getClass());
        }
    }
}
