package test1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SubListEx {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }

        List<Integer> subList = new ArrayList<>(integers.subList(3, 7));

        ListIterator<Integer> integerListIterator = subList.listIterator();

        while (integerListIterator.hasNext()) {
            Integer next = integerListIterator.next();
            integerListIterator.set(next * 2);
        }

        System.out.println(subList);
        System.out.println(integers);

    }

}
