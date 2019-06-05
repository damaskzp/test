package test1;

import java.util.*;

public class CollectHW {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("Elem1");
        list1.add("Elem2");
        list1.add("Elem3");
        list1.add("Elem4");
        list1.add("Elem5");

        List<String> list2 = new LinkedList<>();
        list2.add("elem_01");
        list2.add("elem_02");
        list2.add("elem_03");
        list2.add("elem_04");
        list2.add("elem_05");

       System.out.println(list2.equals(list1));
        list2.addAll(list1);




    }
}
