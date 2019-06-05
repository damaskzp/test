package test1;

public class DeadLockEx {
    public static final Object object1=new Object();
    public static final Object object2=new Object();

    public static void main(String[] args) {
        new ThreadA().start();
        new ThreadB().start();
    }
}
