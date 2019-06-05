package test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyNumGenerator {
    private int numOfElem;
    private int maxNum;

    public MyNumGenerator(int numOfElem, int maxNum) {
        this.numOfElem = numOfElem;
        this.maxNum = maxNum;
    }

    public List<Integer> generate(){

        Random random=new Random();

        List<Integer> myList=new ArrayList<>();
        for (int i = 0; i < numOfElem ; i++) {
            myList.add(random.nextInt(maxNum));
        }
        return myList;
    }
}
