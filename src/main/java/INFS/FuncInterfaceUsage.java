package INFS;

import java.util.Arrays;
import java.util.List;

public class FuncInterfaceUsage {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(sumFunc(integers, x -> x * x));
        System.out.println(sumFunc(integers, x -> x));
        System.out.println(sumFunc(integers, x -> x % 2));
    }

    public static long sumFunc(List<Integer> list, CustomFuncInterface cfi) {
        long sum = 0;
        for (Integer integer : list) {
            sum += cfi.calc(integer);
        }
        return sum;
    }
}
