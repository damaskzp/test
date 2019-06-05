package test1;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashEx {
    public static void main(String[] args) {

        Map<Integer, Integer> map = new LinkedHashMap<>();
        add(1000, map);
        add(10900, map);
        add(23, map);

        System.out.println(map);
//        for (Integer key : map.keySet()) {
//            System.out.println("Key "+key+", value="+map.get(key));
//        }

    }

    public static void add(Integer i, Map<Integer, Integer> map) {

        map.put(i, i.toString().length());

        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next.toString().length() > 3) {
                iterator.remove();
            }
        }
    }
}
