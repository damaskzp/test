package FileServer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Downloader {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("172.30.2.80", 8080);
        InputStream is = socket.getInputStream();
        FileOutputStream fileOutputStream = new FileOutputStream(
                "C:\\Users\\Dima Bulat\\Desktop\\1\\котэ.jpg");

        byte[] b = new byte[1024];
        int writeBytes;
        while ((writeBytes = is.read(b)) != -1) {
            fileOutputStream.write(b, 0, writeBytes);
        }
        fileOutputStream.flush();
        fileOutputStream.close();
    }
}

