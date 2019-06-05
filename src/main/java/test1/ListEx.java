package test1;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        list.add("qqq");
        list.add("rrr");
        list.add("4r");
        list.add(2,"r5");
        System.out.println(list.get(2));
        for (String s:list){
            System.out.println(s);
        }
    }
}
