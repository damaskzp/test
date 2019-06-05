package test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class RecArSumMain {
    private static int SIZE = 10_000;

    public static void main(String[] args) {
        List<Long> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            list.add((long) random.nextInt(100));
        }
        long sum = 0;
        for (Long e : list) {
            sum += e;
        }
        System.out.println("Check summ = " + sum);
        ForkJoinPool pool=new ForkJoinPool();
        Long l=pool.invoke(new RecArSum(list));
        System.out.println("Result = "+l);
    }
}

