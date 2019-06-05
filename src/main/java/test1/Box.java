package test1;

public class Box<T, T1> {
    private T o;
    private T1 another;

    T getItem() {
        return o;
    }

    void setItem(T o) {
        this.o = o;
    }
}
