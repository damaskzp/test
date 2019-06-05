package test1;

import java.util.List;

public class MainMultiList {
    public static void main(String[] args) {
        MultiList<Integer,String> multiList=new MultiList<>();
        multiList.add(1,"one");
        multiList.add(1,"first");
        multiList.add(1,"second");
        List<String> list= multiList.get(3);
        System.out.println(list);
//        list.add("two");
//        System.out.println(list);


    }
}
