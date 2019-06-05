package test1;

import java.util.concurrent.ForkJoinPool;

public class RecursivSumMain {
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool(7);
        RecursivSum summator = new RecursivSum(0, 100_000);
        Long result = forkJoinPool.invoke(summator);
        System.out.println("result= " + result);

        long sum = 0;
        for (long i = 0; i <= 100_000; i++) {
            sum += i;
        }
        System.out.println("sum= " + sum);
    }
}
