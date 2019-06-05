package test1;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class DequeRevers {
    public static void main(String[] args) {

        Deque<String> strings = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            strings.addLast("ELEM " + i);
        }
        System.out.println(strings);

        List<String> revers = new ArrayList<>();
        while (strings.size() > 0) {
            revers.add(strings.pollLast());
        }
        System.out.println(revers);

    }
}
