package test1;

public class ThreadA extends Thread {
    @Override
    public void run() {
        System.out.println("Thread A started");
        synchronized (DeadLockEx.object1) {
            System.out.println("Thread A lock object1 ");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread A wait object2");
            synchronized (DeadLockEx.object2) {
                System.out.println("Thread A lock object2");
            }
        }
        System.out.println("Thread finish");
    }
}
