package test1;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
       char[] unique=uniqueChars("Hello world");
        System.out.println(Arrays.toString(unique));

//        String s = "";
//        for (int i = 0; i < 1000; i++) {
//            s += i;
//        }
//        System.out.println(s);

        StringBuilder sb=new StringBuilder();
        for (int i = 0; i <50000 ; i++) {
            sb.append(i);
        }
        System.out.println(sb);

    }

    private static char[] uniqueChars(String s){
        char[] chars=s.toCharArray();
        StringBuilder unique= new StringBuilder();

        for (char aChar : chars) {
            if (unique.toString().indexOf(aChar) == -1)
            unique.append(aChar);
            }
        return unique.toString().toCharArray();

    }

}
