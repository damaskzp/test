package test1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ReversList {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            stringList.add("elem " + i);
        }
        System.out.println(stringList);

        List<String> revStringList = new ArrayList<>();

        for (int i = stringList.size() - 1; i >= 0; i--) {
            revStringList.add(stringList.get(i));
        }
        System.out.println(revStringList);

    }
}
