package test1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main3 {
    public static void main(String[] args) {


        String s="\\\\";
        System.out.println(s);


        String email="new damaskzp@gmail.com !!!";
        Pattern pattern=Pattern.compile(".*( \\w+@\\w+\\.\\w{2,3}).*");
        Matcher matcher=pattern.matcher(email);
        if (matcher.matches()){
            System.out.println("This is email");
            String group=matcher.group(1);
            System.out.println(group);
        }else {
            System.out.println("No email");
        }
    }
}
