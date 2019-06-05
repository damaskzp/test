package MyCalculator;

import javax.swing.*;
import java.awt.event.*;


public class MyCalculator extends JFrame {
    private JButton num1;
    private JButton Multiply;
    private JButton num3;
    private JTextField Screen;
    private JButton num2;
    private JButton num4;
    private JButton num5;
    private JButton num6;
    private JButton Divide;
    private JButton num7;
    private JButton num8;
    private JButton num9;
    private JButton Minus;
    private JButton num0;
    private JButton Plus;
    private JButton Result;
    private JPanel Panel;
    private JButton CE;
    private JButton comma;
    private double A;
    private String action;


    public MyCalculator() {
        setContentPane(Panel);
        setSize(500, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        Screen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        num1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Screen.setText(Screen.getText()+"1");
            }
        });
        num2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Screen.setText(Screen.getText()+"2");
            }
        });
        num3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Screen.setText(Screen.getText()+"3");
            }
        });
        num4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Screen.setText(Screen.getText()+"4");
            }
        });
        num5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Screen.setText(Screen.getText()+"5");
            }
        });
        num6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Screen.setText(Screen.getText()+"6");
            }
        });
        num7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Screen.setText(Screen.getText()+"7");
            }
        });
        num8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Screen.setText(Screen.getText()+"8");
            }
        });
        num9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Screen.setText(Screen.getText()+"9");
            }
        });
        num0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Screen.setText(Screen.getText()+"0");
            }
        });
        Plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                A=Double.valueOf(Screen.getText());
                Screen.setText("");
                action="+";
            }
        });
        Result.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double B=Double.valueOf(Screen.getText());
                if ("+".equals(action)){
                    Screen.setText(String.valueOf(A+B));
                }else if("*".equals(action)){
                    Screen.setText(String.valueOf(A*B));
                }else if ("-".equals(action)){
                    Screen.setText(String.valueOf(A-B));
                }else if ("/".equals(action)){
                    Screen.setText(String.valueOf(A/B));
                }
            }
        });
        CE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Screen.setText("");
            }
        });
        Multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                A=Double.valueOf(Screen.getText());
                Screen.setText("");
                action="*";
            }
        });
        Divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                A=Double.valueOf(Screen.getText());
                Screen.setText("");
                action="/";
            }
        });
        Minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                A=Double.valueOf(Screen.getText());
                Screen.setText("");
                action="-";
            }
        });
        comma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Screen.setText(Screen.getText()+".");
            }
        });
    }

    public static void main(String[] args) {
        new MyCalculator();
    }
}
