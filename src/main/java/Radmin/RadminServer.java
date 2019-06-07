package Radmin;

import java.awt.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class RadminServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket server = new ServerSocket(8090);
        Socket socket = server.accept();
        RadminServerWindow radminServerWindow = new RadminServerWindow();
        while (true) {
            System.out.println("server");
            InputStream is = socket.getInputStream();
            FileOutputStream fileOutputStream = new FileOutputStream(
                    "C:\\Users\\Dima Bulat\\Desktop\\1\\screen.jpg");


            byte[] b = new byte[1024];
            int writeBytes;
            while ((writeBytes = is.read(b)) != -1) {
                fileOutputStream.write(b, 0, writeBytes);
            }
            fileOutputStream.flush();
            fileOutputStream.close();
            System.out.println("close filr");
            Thread.sleep(1000);
            radminServerWindow.Refresh();
        }
    }
}
