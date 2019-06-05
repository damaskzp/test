package test1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectCW1 {
    public static void main(String[] args) {

        List<Long> longs = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            longs.add((long) i);

//            Iterator<Long> iterator = longs.iterator();
//            while ((iterator.hasNext())) {
//                Long current = iterator.next();
//                if (current % 2 == 0) {
//                    iterator.remove();
//                }
//            }
        }
        longs.removeIf(aLong -> aLong % 2 == 0);
        System.out.println(longs);


    }
}
