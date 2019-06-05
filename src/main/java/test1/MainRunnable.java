package test1;


public class MainRunnable {
    public static void main(String[] args) {
        RunnableEx runnableEx=new RunnableEx();
        Thread thread=new Thread(()->System.out.println("Runnable " +
                Thread.currentThread().getName()));
        thread.start();
    }
}
