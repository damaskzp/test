package test5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileCopier {
    public static void main(String[] args) throws IOException {

        try (FileInputStream in = new FileInputStream("C:\\Users\\Dima Bulat\\Desktop\\DocIn.txt");
             FileOutputStream out = new FileOutputStream("C:\\Users\\Dima Bulat\\Desktop\\DocOut.txt")) {
            byte[]inputArray=new byte[4];
            int c = in.read(inputArray);
            while (c != -1) {
                System.out.println(Arrays.toString(inputArray));
                out.write(inputArray,0,c);
                c = in.read(inputArray);
            }
        }
    }
}
