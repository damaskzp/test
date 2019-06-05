package test5;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutEx {
    public static void main(String[] args) throws IOException {
        try (DataOutputStream os =
                     new DataOutputStream(
                             new FileOutputStream("C:\\Users\\Dima Bulat\\Desktop\\DocInNew.txt"))){
            os.writeBoolean(true);
            os.writeBoolean(false);
            os.writeDouble(12.34);
            os.writeFloat(12.34f);
            os.writeInt(10);
            os.writeLong(11);
            os.writeBytes("qwerty");
            os.writeChars("qwerty");
            os.writeUTF("qwerty");
        }
    }
}
