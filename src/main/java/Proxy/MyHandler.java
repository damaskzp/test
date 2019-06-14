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
        System.out.println("The Method < " + method.getName() + " > invoked with arg:" + Arrays.toString(args));
        Object result = method.invoke(target, args);
        System.out.println("The Method < " + method.getName() + " > ends with result: " + result.toString());
        return result;
    }
}
