package test1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;

public class MyCollections {
    static StringBuilder getRandomString(){
        Random random = new Random();
        StringBuilder randString = new StringBuilder();
        int length = random.nextInt(15);
        for (int i = 0; i < length; i++) {
            char c = (char)(random.nextInt(26) + 65);
            randString.append(c);
        }
        return randString;
    }

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        LinkedList<String> linkedList = new LinkedList<String>();
        HashSet<String> hashSet = new HashSet<String>();

        for (int i = 0; i < 10; i++) {
            String str = getRandomString().toString();
            System.out.print(str + " ");
            arrayList.add(str);
            linkedList.add(str);
            hashSet.add(str);

        }

        System.out.println();
        System.out.println(arrayList.toString());
        System.out.println(linkedList.toString());
        System.out.println(hashSet.toString());

    }
}
