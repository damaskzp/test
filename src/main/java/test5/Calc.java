package test5;

import javax.swing.*;

public class Calc {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Calculator");
        frame.setSize(700,200);
        frame.setLocation(100,100);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel jPanel=new JPanel();
        frame.add(jPanel);

        JTextField num1=new JTextField("Enter number");
        num1.setEnabled(true);
        num1.setSize(100,100);
        jPanel.add(num1);

        JTextField num2=new JTextField("Enter number");
        num2.setEnabled(true);
        num2.setSize(100,100);
        jPanel.add(num2);

        JTextField result=new JTextField("Result");
        result.setEnabled(true);
        result.setSize(100,100);
        jPanel.add(result);

        JButton button1=new JButton("*");
        jPanel.add(button1);

        JButton button2=new JButton("/");
        jPanel.add(button2);

        JButton button3=new JButton("+");
        jPanel.add(button3);

        JButton button4=new JButton("-");
        jPanel.add(button4);

        frame.setVisible(true);

        NewActionListener actionListener=new NewActionListener(num1,num2,result);
        button1.addActionListener(actionListener);
        button2.addActionListener(actionListener);
        button3.addActionListener(actionListener);
        button4.addActionListener(actionListener);
    }
}
