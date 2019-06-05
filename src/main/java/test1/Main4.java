package test1;

import java.util.Scanner;
//word revers
public class Main4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter word: ");
        String s = scanner.nextLine();

        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = chars.length - 1; i >= 0; i--) {
            sb.append(chars[i]);
        }

        String revers = sb.toString();
        System.out.println(revers);

    }
}
