package test5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private JButton plus;
    private JButton divideButton;
    private JButton minusButton;
    private JButton multiplyButton;
    private JPanel rootPanel;
    private JTextField textFieldA;
    private JTextField textFieldRes;
    private JTextField textFieldB;

    public Calculator(){
        setContentPane(rootPanel);
        setSize(500,600);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double a=Double.valueOf(textFieldA.getText());
                Double b=Double.valueOf(textFieldB.getText());
                textFieldRes.setText(String.valueOf(a*b));
            }
        });
    }

    public static void main(String[] args) {
        new Calculator();

    }
}
