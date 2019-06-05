package test1;

public class Excep {
    public static void main(String[] args) {
        method1();
        System.out.println("Program OK");
    }

    private static void method1() {
        method2();
    }

    private static void method2() {
        try {
            method3();
        } catch (NullPointerException e) {
            System.out.println(("Exception in method 2: " + e.getMessage()));
        } finally {
            System.out.println("Exception in method 2");
        }
    }


    private static void method3() {
        try {
            method4();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(("Exception in method 3: " + e.getMessage()));
        }
    }

    private static void method4() {
        int[] arr = {1, 2, 3};
        int x = arr[4];
    }
}
