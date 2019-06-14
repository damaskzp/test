package Proxy;

class Calculators implements ICalculator {
    public int add(int a, int b) {
        System.out.println(this+" invoke original");
        return a + b;
    }

    public int mul(int a, int b) {
        return a * b;
    }
}
