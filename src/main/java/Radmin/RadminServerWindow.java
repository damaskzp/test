package Radmin;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class RadminServerWindow extends JFrame {

    private JPanel rootPanel;

    public RadminServerWindow()throws IOException{
        setSize(1024,768);
        setContentPane(rootPanel);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        BufferedImage image= ImageIO.read(new File(
                "C:\\Users\\Dima Bulat\\Desktop\\1\\screen.jpg"));
        getGraphics().drawImage(image,0,0,this);
    }

    public static void main(String[] args) throws IOException {
      new RadminServerWindow();
    }

}