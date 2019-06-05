package test1;

import java.util.List;
import java.util.concurrent.RecursiveTask;

public class RecArSum extends RecursiveTask<Long> {
    private List<Long> list;

    public RecArSum(List<Long> list) {
        this.list = list;
    }

    @Override
    protected Long compute() {
        if (list.size() < 100) {
            long sum = 0;
            for (Long e : list) {
                sum += e;
            }
            return sum;
        } else {
            int size = list.size();
            RecArSum firstArSum = new RecArSum(list.subList(0,size/2));
            firstArSum.fork();
            RecArSum secArSum = new RecArSum(list.subList(size/2,size));
            Long result=secArSum.compute();
            return result + firstArSum.join();
        }
    }
}
