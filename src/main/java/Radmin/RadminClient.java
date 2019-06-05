package Radmin;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

import java.net.Socket;

public class RadminClient {
    public static void main(String[] args) throws IOException, AWTException, InterruptedException {
        Socket socket = new Socket("172.30.2.80", 8090);
        OutputStream os = socket.getOutputStream();
        while (true) {
            BufferedImage image = new Robot().createScreenCapture(
                    new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
            ImageIO.write(image, "jpg",
                    new File("C:\\Users\\Dima Bulat\\Desktop\\screen.jpg"));
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
                    "C:\\Users\\Dima Bulat\\Desktop\\screen.jpg"));
            byte[] b = new byte[1024];
            int readBytes;
            while ((readBytes = bis.read(b)) != -1) {
                os.write(b, 0, readBytes);
            }
            os.flush();
            os.close();
            Thread.sleep(1000);
        }
    }
}
