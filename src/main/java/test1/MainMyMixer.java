package test1;

import java.util.Arrays;

public class MainMyMixer {
    public static void main(String[] args) {

        MyMixer<Integer> myMixer = new MyMixer<>();
        Integer[] arrNew = myMixer.shuffle(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        System.out.println(Arrays.toString(arrNew));


    }
}
