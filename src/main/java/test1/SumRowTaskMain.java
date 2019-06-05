package test1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SumRowTaskMain {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int[][] array = generateArray();
        ExecutorService executorService =
                Executors.newFixedThreadPool(10);
        List<SumRowTask> taskList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            SumRowTask task = new SumRowTask(array[i]);
            taskList.add(task);
        }
        List<Future<Integer>> futures = executorService.invokeAll(taskList);
        int sum = 0;
        for (Future<Integer> future : futures) {
            sum += future.get();

            executorService.shutdown();
            System.out.println(sum);
        }
    }

    private static int[][] generateArray() {

        int[][] array = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = 1;
            }
        }
        return array;
    }
}
