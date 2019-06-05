package test1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class NewList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);

        HashSet<String> listSet = new HashSet<>();
        for (int i = 0; i <10 ; i++) {
            listSet.add(String.valueOf(i));
        }
        System.out.println(listSet);
    }
}
