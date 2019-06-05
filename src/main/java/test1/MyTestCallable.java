package test1;

import java.util.concurrent.Callable;
import java.util.Random;

public class MyTestCallable implements Callable<String> {
    private int workNumber;

    public MyTestCallable(int workNumber){
        this.workNumber =workNumber;
    }

    @Override
    public String call() throws Exception {
        for (int i = 0; i < 5; i++) {
            System.out.println("Worker"+ workNumber +"; iteration="+i);
            Thread.sleep(new Random().nextInt(1500));
        }
        return "work"+ workNumber;
    }
}
