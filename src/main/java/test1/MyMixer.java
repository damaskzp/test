package test1;

import java.util.Random;

public class MyMixer<T> {

    T[] shuffle(T array[]) {

        Random random = new Random();
        int r = random.nextInt(array.length);

        for (int i = 0; i < array.length; i++) {
            T tmp = array[i];
            array[i] = array[r];
            array[r] = tmp;
        }
        return array;
    }
}
