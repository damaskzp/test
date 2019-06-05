package test5;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentMainWriter {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\student.ser"));
        Student dima = new Student("Dima", "Bulat", 35);
        Student ivan = new Student("Ivan", "Ivanov", 30);
        oos.writeObject(dima);
        oos.writeObject(ivan);
        oos.close();
    }
}

