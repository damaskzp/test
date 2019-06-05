package test1;

public class DataSender extends Thread {
    private final MyTestData myTestData;

    public DataSender(MyTestData myTestData) {
        this.myTestData = myTestData;
    }

    @Override
    public void run() {

        synchronized (myTestData) {
            System.out.println("Thread " + getName() + " started");
            while (!myTestData.ready()) {
                try {
                    System.out.println("Thread "+getName()+" started");
                    myTestData.wait();
                   // myTestData.notify();
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Thread " + getName() + "data= " + myTestData);
        }
    }
}
