package Proxy;

class Calculators implements ICalculator {
    @Logger(prefix = "!!!!")
    public int add(int a, int b) {
        System.out.println(this+" invoke original");
        return a + b;
    }

    public int mul(int a, int b) {
        return a * b;
    }
}
