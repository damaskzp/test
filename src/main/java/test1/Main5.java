package test1;

public class Main5 {
    public static void main(String[] args) {

        Byte b=2;
        Integer i=56;
        System.out.println(compute(b, i));

    }
    static private Long compute (Byte b,Integer i){
        return (long) (b + i);
    }
}
