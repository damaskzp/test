package test1;

import java.util.concurrent.Callable;

public class SumRowTask implements Callable<Integer> {
    private int[] row;

    public SumRowTask(int[] row) {
        this.row = row;
    }

    @Override
    public Integer call()  {
        int sum = 0;
        for (int elem : row) {
            sum += elem;
        }
        return sum;
    }
}
