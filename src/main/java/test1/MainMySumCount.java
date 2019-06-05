package test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainMySumCount {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();

        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            myList.add(random.nextInt(1000));
        }

        MySumCount thread1 = new MySumCount();
        thread1.setStartIndex(0);
        thread1.setStopIndex(100);
        thread1.setList(myList);

        MySumCount thread2 = new MySumCount();
        thread2.setStartIndex(101);
        thread2.setStopIndex(200);
        thread2.setList(myList);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(thread1.getResultSum() + thread2.getResultSum());

    }
}
