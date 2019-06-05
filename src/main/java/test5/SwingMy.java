package test5;

import javax.swing.*;
import java.awt.*;

public class SwingMy {
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("My window");
        frame.setSize(300, 200);
        frame.setLocation(100, 200);
        for (int i = 0; i < 50; i++) {
            int currentX = (int) frame.getLocation().getX();
            frame.setLocation(currentX + 10, 200);
            Thread.sleep(2);
        }
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout());
        JButton button=new JButton("Click!!!");
        jPanel.add(button);

        JTextField textField=new JTextField();
        textField.setEnabled(true);

        MyActionListener myActionListener=new MyActionListener(textField);

        button.addActionListener(myActionListener);

        jPanel.add(textField);

        frame.add(jPanel);
//        JButton button=new JButton("Click");
//        button.setSize(50,50);
//        frame.add(button);
        frame.setVisible(true);
//        System.exit(0);
    }
}
