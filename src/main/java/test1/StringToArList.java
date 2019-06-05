package test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringToArList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String[] array = s.split(",");

        List<String> myList = new ArrayList<>();

        for (String s1 : array) {
            if (s1.length() > 3) {
                myList.add(s1);
            }
        }

        System.out.println(myList);
    }
}
