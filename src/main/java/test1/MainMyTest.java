package test1;

public class MainMyTest {
    public static void main(String[] args) {

        MyTestMethod<Integer> integerMyTestMethod=new MyTestMethod<>();
        int num = integerMyTestMethod.calcNum(new Integer[]{0,5,0,0,0,0},3);
        System.out.println(num);
    }
}
