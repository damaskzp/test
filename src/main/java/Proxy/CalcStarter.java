package Proxy;

import java.lang.reflect.Proxy;

public class CalcStarter {
    public static void main(String[] args) {
        Calculators calculators = new Calculators();
        int addRes = calculators.add(2, 5);
        int mulRes = calculators.mul(4, 6);
        System.out.println(addRes);
        System.out.println(mulRes);

        ICalculator proxyCalc = (ICalculator) Proxy.newProxyInstance(
                calculators.getClass().getClassLoader(),
                calculators.getClass().getInterfaces(),
                new MyHandler(new Calculators()));
        System.out.println(proxyCalc.getClass());

        int add=proxyCalc.add(2,4);
        int mul=proxyCalc.mul(4,3);
        System.out.println(add);
        System.out.println(mul);
    }
}
