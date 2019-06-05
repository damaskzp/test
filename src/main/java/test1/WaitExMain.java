package test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WaitExMain {
    public static void main(String[] args) {
        MyTestData data = new MyTestData();
        System.out.println(data.ready());
        List<DataSender> sender = Arrays.asList(new DataSender(data),
                new DataSender(data),
                new DataSender(data));
        for (DataSender dataSender : sender) {
            dataSender.start();
        }
        DataGenerator generator = new DataGenerator(data);
        generator.start();
    }

}
