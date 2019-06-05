package test1;

import java.util.Random;

public class AtomicArrayWriter extends Thread {
    private AtomicArray atomicArray;

    public AtomicArrayWriter(AtomicArray atomicArray) {
        this.atomicArray = atomicArray;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Start write");
        int index = new Random().nextInt(10);
        atomicArray.setString(" " + index, index);
        System.out.println(getName()+" End write");
    }
}
