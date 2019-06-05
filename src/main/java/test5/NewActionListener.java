package test5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewActionListener implements ActionListener {

    private final JTextField num1;
    private final JTextField num2;
    private final JTextField result;

    public NewActionListener(JTextField num1,
                             JTextField num2,
                             JTextField result) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Double a = Double.valueOf(num1.getText());
        Double b = Double.valueOf(num2.getText());

        String operation = e.getActionCommand();
        switch (operation) {
            case "+":
                result.setText(String.valueOf(a + b));
                break;
            case "-":
                result.setText(String.valueOf(a - b));
                break;
            case "*":
                result.setText(String.valueOf(a * b));
                break;
            case "/":
                result.setText(String.valueOf(a / b));
                break;
        }
    }
}
