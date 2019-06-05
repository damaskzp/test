package test1;

public class MainMyTuple {
    public static void main(String[] args) {

       MyTuple<String,Integer,Long> myTuple=new MyTuple<>("qwerty",24,45L);
       MyTuple<Double,String,String> myTuple1=new MyTuple<>(3.14,"qwerty","hello");

        System.out.println(myTuple);
        System.out.println(myTuple1);

    }
}
