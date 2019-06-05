package test4;

import java.util.Date;
import java.util.concurrent.Callable;

public class DateCall implements Callable<Date> {

      @Override
    public Date call() throws Exception {
          System.out.println("Start get date");
        Thread.sleep(2000);
        return new Date();
    }
}
