package test1;

public class AtomicArrayMain {
    public static void main(String[] args) {
       AtomicArray atomicArray=new AtomicArray();
        for (int i = 0; i < 100; i++) {
            new AtomicArrayReader(atomicArray).start();
        }
        for (int i = 0; i <10 ; i++) {
            new AtomicArrayWriter(atomicArray).start();
        }
    }
}
