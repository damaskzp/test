package test1;

import java.util.*;

public class SetEx {
    public static void main(String[] args) {

        Random rnd=new Random();
        Set<String> hashSet=new HashSet<>();
        Set<String> linked=new LinkedHashSet<>();
        Set<String> tree=new TreeSet<>();

        for (int i = 0; i < 11; i++) {
            hashSet.add("Elem " + i);
            linked.add("Elem " + i);
            tree.add("Elem " + i);

        }

        //System.out.println(hashSet);
        //System.out.println(linked);
        //System.out.println(tree);

        //Set<Car> cars1=new TreeSet<>(new CarComparator());
        Set<Car> cars=new HashSet<>();

        cars.add(new Car("Ford",23));
        cars.add(new Car("Ford",43));

//        for (int i = 0; i < 5; i++) {
//            cars.add(new Car("Ford",rnd.nextInt(20)+100));
//        }
        System.out.println(cars);


    }
}
