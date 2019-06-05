package test1;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        String s1 = "hello world";

//        char[] arrayChars = new char[]{'h', 'e', 'l', 'o'};
//        final String s2 = new String(arrayChars);
//        System.out.println(s2);
//        System.out.println(s1);
//        System.out.println(s1.equals(s2));
//
//        String s3 = s1.concat(s2);
//        //System.out.println(s3);
//
//        char[] chars = s1.toCharArray();
//        //System.out.println(Arrays.toString(chars));
//        System.out.println(findChar(s1, 'o'));



    }


    static int findChar(String s, char charToFind) {

        char[] chars = s.toCharArray();
        int i;
        for (i = 0; i < chars.length; i++) {
            if (charToFind == chars[i]) {
                return i;
            }

        }
        return -i;
    }
}
