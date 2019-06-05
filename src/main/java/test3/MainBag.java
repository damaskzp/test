package test3;

import java.util.ArrayList;
import java.util.List;

public class MainBag {
    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        Bag bag = new Bag();
        bag.add("1",list);
        bag.count("1",list);


    }

    private static void Count(List<String> list, String s) {
        int count = 0;
        for (String current : list) {
            if (current.equals(s)) {
                count++;
            }
        }
        System.out.println(count);
    }
}

