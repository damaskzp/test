package test5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener implements ActionListener {
private JTextField textField;

    public MyActionListener(JTextField textField) {
        this.textField=textField;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Click!!!!"+e.getActionCommand());
        System.out.println(textField.getText());
    }
}
