package test1;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = factorial(n).toString();
        System.out.println(s);
    }

    public static BigInteger factorial (int n){
        BigInteger number = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++){
            number = number.multiply(BigInteger.valueOf(i));
        }
        return number;
    }
}
