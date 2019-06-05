package test1;

import java.util.Arrays;

import static test1.MyDerection.EAST;

public class MainMyDirect {
    public static void main(String[] args) {

        System.out.println(EAST);
        System.out.println(EAST.name());
        System.out.println(MyDerection.SOUTH.ordinal());
        System.out.println(Arrays.toString(MyDerection.values()));
        System.out.println(MyDerection.valueOf("EAST"));

        for (MyDerection direction : MyDerection.values()) {
            System.out.println(direction.getShortname());
            System.out.println(direction.getDirectionCode());
        }
    }
}
