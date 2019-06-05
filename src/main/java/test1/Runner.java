package test1;

import java.util.concurrent.CountDownLatch;

public class Runner extends Thread {
    private CountDownLatch latch;
    private String name;

    public Runner(CountDownLatch latch, String name) {
        this.latch = latch;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " on start");
            latch.await();
            System.out.println(name + " starting at " +
                    System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
