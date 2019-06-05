package test1;

public class ConcurrentEx {
    private volatile static int x = 0;

    public static void main(String[] args) throws InterruptedException {
        //ConcurrentEx main=new ConcurrentEx();
        for (int j = 0; j <10 ; j++) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                x++;
            }
        });
        thread.start();}
        //thread.join();
        Thread.sleep(100);
        System.out.println(x);
    }
}
