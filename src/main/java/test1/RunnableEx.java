package test1;

public class RunnableEx implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable " + Thread.currentThread().getName());
    }
}
