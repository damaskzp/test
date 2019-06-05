package test4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainDateCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService exec = Executors.newFixedThreadPool(4);
        System.out.println("Thread pool created");

//        List<DateCall> list = new ArrayList<DateCall>();
//        for (int i = 0; i < 10; i++) {
//            list.add(new DateCall());
//        }
//        List<Future<Date>> futures = exec.invokeAll(list);


        DateCall dateCall = new DateCall();
        Future<Date> futureDate = exec.submit(dateCall);

        System.out.println("Task started by exec");

        while (!futureDate.isDone()){
            System.out.println("Not ready");
        }

        Date date = futureDate.get();
        System.out.println(date);
        //exec.shutdown();


    }
}

