package test5;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskOneMain {
    public static void main(String[] args) throws IOException {
//        try (DataOutputStream os =
//                     new DataOutputStream(
//                             new FileOutputStream("C:\\Users\\Dima Bulat\\Desktop\\Doc111.txt"))) {
//            List<Integer> list = new ArrayList<>();
//            for (int i = 1; i <= 9; i++) {
//                list.add(i);
//                try {
//                    os.writeUTF(String.valueOf(i));
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        RandomAccessFile file = new RandomAccessFile("C:\\Users\\Dima Bulat\\Desktop\\Doc111.txt", "rw");
        for (Integer number:list) {
            file.seek((list.size() - 1) * 2 - number * 2);
            file.writeBytes(number.toString());
            file.close();
        }


    }
}
