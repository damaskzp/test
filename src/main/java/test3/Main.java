package test3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100_000; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        Collections.shuffle(list);
        long end = System.currentTimeMillis();
        System.out.println(end - start + " ms - ArrayList shuffle");

        long start1 = System.currentTimeMillis();
        Collections.sort(list);
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1 + " ms - ArrayList sort");

        List<Integer> listLink = new LinkedList<>();
        for (int j = 0; j < 100_000; j++) {
            listLink.add(j);
        }
        long start0 = System.currentTimeMillis();
        Collections.shuffle(listLink);
        long end0 = System.currentTimeMillis();
        System.out.println(end0 - start0 + " ms - LinkedList shuffle");

        long start01 = System.currentTimeMillis();
        Collections.sort(listLink);
        long end01 = System.currentTimeMillis();
        System.out.println(end01 - start01 + " ms - LinkedList sort");
    }

}
