package test1;

import java.util.concurrent.TimeUnit;

public class MyTimeBomb {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 10; i > 0; i--) {
                System.out.println(i + " " + Thread.currentThread().getName());
                try {
                    Thread.sleep(TimeUnit.SECONDS.toMillis(1));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Boom! " + Thread.currentThread().getName());
        });
        thread.start();
        thread.join();
        System.out.println("Boom! " + Thread.currentThread().getName());
    }
}
