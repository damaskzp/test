package test4;

import java.util.concurrent.Callable;

public class PrintRunable implements Callable<Void> {
    private volatile int count = 0;



    @Override
    public Void call() throws InterruptedException {
        Thread.sleep(2);
        synchronized (this) {
            count++;
        }
        Thread.sleep(2);
        //System.out.println("printer work "+count);
        return null;
    }
}
