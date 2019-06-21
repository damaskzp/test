package Lambda;

import java.util.ArrayList;
import java.util.List;

public class ComparatorEx {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(List.of("1","20","643","0.4","5.87"));
        list.sort((o1, o2) -> o1.length() - o2.length());
        System.out.println(list);

    }
}
