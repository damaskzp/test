package test5;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class TaskInClass {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextLine();
        }
        System.out.println(Arrays.toString(array));
        try (DataOutputStream os =
                     new DataOutputStream(
                             new FileOutputStream("C:\\Users\\Dima Bulat\\Desktop\\DocNew.txt",true))) {
            for (String element : array) {
                os.writeBytes(String.valueOf(element));
                os.writeBytes("\n");
            }
        }
        try (DataInputStream is =
                     new DataInputStream(
                             new FileInputStream(
                                     "C:\\Users\\Dima Bulat\\Desktop\\DocNew.txt"))) {
            for (int i = 0; i < 5; i++) {
                System.out.println(is.readByte());
            }
        }
    }
}
