package test1;

import java.util.Date;

public class MainHelloWorld {
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(()-> {
            for (int i = 0; i <5 ; i++) {
                System.out.println(new Date()+" "+Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.setName("My Thread");
        thread.start();
        thread.join();
    }
}
