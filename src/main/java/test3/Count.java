package test3;

import java.util.ArrayList;
import java.util.List;

class Bag {


    public Bag() {

    }

    void add(String s, List<String> list){
        list.add(s);
    }

    void remove(String s){}

    int count(String s,List<String> list){

        int count = 0;
        for (String current : list) {
            if (current.equals(s)) {
                count++;
            }
        }

        return count;
    }


}
