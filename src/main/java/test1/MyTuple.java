package test1;

public class MyTuple<A,B,C> {
    private A A;
    private B B;
    private C C;

    public MyTuple(A a, B b, C c) {
        A = a;
        B = b;
        C = c;
    }

    public A getA() {
        return A;
    }

    public B getB() {
        return B;
    }

    public C getC() {
        return C;
    }

    @Override
    public String toString() {
        return "MyTuple: " +
                "A=" + A +
                ", B=" + B +
                ", C=" + C;
    }
}
