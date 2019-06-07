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
            DataInputStream is = new DataInputStream(socket.getInputStream());
            FileOutputStream fileOutputStream = new FileOutputStream(
                    "C:\\Users\\Dima Bulat\\Desktop\\1\\screen.jpg");

            long size = is.readLong();
            long writeBytes = 0;
            int lastRead = 0;
            byte[] b = new byte[1024];

            while (true) {
                lastRead = is.read(b);
                writeBytes += lastRead;
                fileOutputStream.write(b, 0, lastRead);
                if (writeBytes >= size) {
                    break;
                }
            }

            fileOutputStream.flush();
            fileOutputStream.close();
            System.out.println("close file");
            Thread.sleep(1000);
            radminServerWindow.Refresh();
        }
    }
}
