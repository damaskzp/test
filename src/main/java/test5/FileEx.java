package test5;

import java.io.File;
import java.io.IOException;

public class FileEx {
    public static void main(String[] args) throws IOException {
        File userFile=new File("C:\\Users\\Dima Bulat\\Desktop\\New.txt");
        System.out.println(userFile.getCanonicalPath());
        System.out.println(userFile.getAbsoluteFile());
        userFile.getFreeSpace();
    }
}
