package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;


public class MyHandler implements InvocationHandler {
    private Object target;

    public MyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy,
                         Method method,
                         Object[] args) throws Throwable {
        Object result = method.invoke(target, args);

        Method originalMethod = target.getClass().getMethod(method.getName(), method.getParameterTypes());

        if (originalMethod.isAnnotationPresent(Logger.class)) {
            Logger logger = originalMethod.getAnnotation(Logger.class);
            System.out.println(logger.prefix() + "The Method < " + method.getName() + " > invoked with arg:" + Arrays.toString(args));
            System.out.println(logger.prefix() + "The Method < " + method.getName() + " > ends with result: " + result.toString());
        }
        return result;
    }
}
