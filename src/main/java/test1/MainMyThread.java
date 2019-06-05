package test1;

public class MainMyThread {
    public static void main(String[] args) {
        System.out.println("Start in thread " + Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            MyThread myThread = new MyThread();
            myThread.start();
        }
    }
}
