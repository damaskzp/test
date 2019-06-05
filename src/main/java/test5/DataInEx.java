package test5;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInEx {
    public static void main(String[] args) throws IOException {
        try (DataInputStream is =
                     new DataInputStream(
                             new FileInputStream("C:\\Users\\Dima Bulat\\Desktop\\DocInNew.txt"))) {
            System.out.println("b= " + is.readBoolean());
            System.out.println("b= " + is.readBoolean());
            System.out.println("b= " + is.readDouble());
            System.out.println("b= " + is.readFloat());
            System.out.println("b= " + is.readInt());
            System.out.println("b= " + is.readLong());

            byte[] stringAsBytes = new byte[6];
            for (int i = 0; i < 6; i++) {
                stringAsBytes[i] = is.readByte();
            }
            System.out.println(new String(stringAsBytes));

            char[] stringAsChars = new char[6];
            for (int i = 0; i < 6; i++) {
                stringAsChars[i] = is.readChar();
            }
            System.out.println(new String(stringAsChars));

            System.out.println("b= " + is.readUTF());
            System.out.println(is.read());
        }

    }
}
