package test4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SyncMain {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService =
                Executors.newFixedThreadPool(4);
        List<PrintRunable> runableList=new ArrayList<PrintRunable>();        PrintRunable printRunable=new PrintRunable();
        for (int i = 0; i < 100_000; i++) {
            runableList.add(new PrintRunable());

        }
        executorService.invokeAll(runableList);
        //System.out.println(PrintRunable.count());
    }
}
