package Proxy;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class LogStarter {
    public static void main(String[] args) {
        List proxylist = (List) Proxy.newProxyInstance(
                List.class.getClassLoader(),
                ArrayList.class.getInterfaces(),
                new MyHandler(new ArrayList<>()));
        proxylist.add("1");
        proxylist.add("2");
        proxylist.size();
        proxylist.get(1);
        proxylist.getClass();
        System.out.println(proxylist);
    }
}
