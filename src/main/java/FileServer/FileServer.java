package FileServer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        Socket socket = serverSocket.accept();
        OutputStream os = socket.getOutputStream();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
                "C:\\Users\\Dima Bulat\\Desktop\\котэ.jpg"));
        byte[] b = new byte[1024];
        int readBytes;
        while ((readBytes = bis.read(b)) != -1) {
            os.write(b, 0, readBytes);
        }
        os.flush();
        os.close();
    }
}
