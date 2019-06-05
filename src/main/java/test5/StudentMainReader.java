package test5;

import java.io.*;

public class StudentMainReader {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois =new ObjectInputStream((new FileInputStream("D:\\student.ser")));

        Student student=(Student)ois.readObject();
        System.out.println(student.getFistName());
        System.out.println(student.getLastName());
        System.out.println(student.getAge());
        student=(Student)ois.readObject();
        System.out.println(student.getFistName());
        System.out.println(student.getLastName());
        System.out.println(student.getAge());
        ois.close();
    }
}
