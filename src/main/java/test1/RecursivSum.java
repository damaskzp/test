package test1;

import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class RecursivSum extends RecursiveTask<Long> {
    private long from;
    private long to;

    public RecursivSum(long from, long to) {
        this.from = from;
        this.to = to;
    }

    @Override
    protected Long compute() {
        if ((to - from) <= 100) {
            long sum = 0;
            for (long i = from; i <= to; i++) {
                sum += i;
            }
            System.out.println(Thread.currentThread().getName() +
                    " Compute sum between " + from
                    + " and " + to + " = " + sum);
            return sum;
        } else {
            long mid = (to + from) / 2;
            System.out.println(Thread.currentThread().getName() +
                    " forking on 2 task. first: " + from
                    + " to " + mid + " sec:  " + mid + 1 + " to " + to);

            RecursivSum firstHalf = new RecursivSum(from, mid);
            RecursivSum secHalf = new RecursivSum(mid + 1, to);
            ForkJoinTask<Long> fork = firstHalf.fork();
            Long compute = secHalf.compute();
            return fork.join() + compute;


        }
    }
}
