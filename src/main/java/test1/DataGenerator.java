package test1;

import java.util.Random;

public class DataGenerator extends Thread {
    private final MyTestData myTestData;

    public DataGenerator(MyTestData myTestData) {
        this.myTestData = myTestData;
    }

    @Override
    public void run() {
        System.out.println("Start generate data");
        byte[] array = new byte[10];
        new Random().nextBytes(array);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (myTestData){
        myTestData.setData(array);
        myTestData.notifyAll();}

        System.out.println("All data generated "+ myTestData);

    }
}
