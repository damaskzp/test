package test1;

public class ThreadB extends Thread {
    @Override
    public void run() {
        System.out.println("Thread A started");
        synchronized (DeadLockEx.object2) {
            System.out.println("Thread B lock object2 ");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread B wait object1");
            synchronized (DeadLockEx.object1) {
                System.out.println("Thread B lock object1");
            }
        }
        System.out.println("Thread finish");
    }
}
