package test1;

import java.util.Date;
import java.util.concurrent.CountDownLatch;

public class Starter {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(5);
        new Runner(latch, "R1").start();
        new Runner(latch, "R2").start();
        new Runner(latch, "R3").start();
        new Runner(latch, "R4").start();
        new Runner(latch, "R5").start();

        while (latch.getCount() > 0) {
            System.out.println(latch.getCount() + " ... "
                    + new Date());
            Thread.sleep(1000);
            if (latch.getCount() == 1) {
                System.out.println("FIRE!");
            }
            latch.countDown();
        }

    }
}
