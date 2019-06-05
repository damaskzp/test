package test1;

import java.util.concurrent.Semaphore;

public class AtomicArray {
    Semaphore semaphore=new Semaphore(100);
    String[]array=new String[10];

    public void setString(String s, int index) {
        try {
            System.out.println("Write available before acquire"+semaphore.availablePermits());
            semaphore.acquire(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try{array[index]=s;}
        finally {
            semaphore.release(100);
        }
    }
    public String getString(int index) {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
        return  array[index];}
        finally {
            semaphore.release();
            System.out.println("Read available after acquire "+semaphore.availablePermits());
        }
    }
}
