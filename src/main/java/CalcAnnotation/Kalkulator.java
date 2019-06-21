package CalcAnnotation;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Kalkulator extends JFrame {

    private String action;
    private double A;


    private JTextField Screen;
    private JButton a1;
    private JButton a8;
    private JButton a3;
    private JButton a2;
    private JButton plus;
    private JButton a5;
    private JButton a6;
    private JButton a9;
    private JButton a4;
    private JButton a7;
    private JButton result;
    private JButton a0;
    private JPanel Panel;



    public Kalkulator() {
        setTitle("Калькулятор");
        setContentPane(Panel);
        setSize(500, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


        a1.addActionListener(e -> Screen.setText(Screen.getText() + "1"));
        a2.addActionListener(e -> Screen.setText(Screen.getText() + "2"));
        a3.addActionListener(e -> Screen.setText(Screen.getText() + "3"));
        a4.addActionListener(e -> Screen.setText(Screen.getText() + "4"));
        a5.addActionListener(e -> Screen.setText(Screen.getText() + "5"));
        a6.addActionListener(e -> Screen.setText(Screen.getText() + "6"));
        a7.addActionListener(e -> Screen.setText(Screen.getText() + "7"));
        a8.addActionListener(e -> Screen.setText(Screen.getText() + "8"));
        a9.addActionListener(e -> Screen.setText(Screen.getText() + "9"));
        a0.addActionListener(e -> Screen.setText(Screen.getText() + "0"));


        plus.addActionListener(e -> {
            A = Double.valueOf(Screen.getText());
            Screen.setText("");
            action = "+";
        });

        result.addActionListener(e -> {
            double B = Double.valueOf(Screen.getText());
            Screen.setText(String.valueOf(A + B));
        });
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Kalkulator kalkulator = new Kalkulator();

    }

    private static void actions(String action, Kalkulator kalk) throws InvocationTargetException, IllegalAccessException {

        for (Method method : Kalkulator.class.getMethods()) {
            if (method.isAnnotationPresent(Command.class)) {
                Command commandAnnotation =
                        method.getAnnotation(Command.class);
                String value = commandAnnotation.action();
                if (value.equals(action)) {
                    method.invoke(action);
                }
            }
        }
    }
}