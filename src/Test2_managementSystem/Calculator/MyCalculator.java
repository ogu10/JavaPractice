package Test2_managementSystem.Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class MyCalculator extends JFrame implements ActionListener {
    static JLabel label;
    static JLabel label2;
    static JLabel label3;
    static JLabel label4;
    JButton buttonEqual;
    JButton buttonClear;
    static String func;

    public MyCalculator() {

        //calculation format
        label = new JLabel("", JLabel.RIGHT);
        label2 = new JLabel("0", JLabel.RIGHT);
        label3 = new JLabel("", JLabel.RIGHT);
        label4 = new JLabel("", JLabel.RIGHT);
        buttonEqual = new JButton("=");
        buttonClear = new JButton("Clear");


        setLayout(new GridLayout(5, 4, 0, 0));
        add(label,0);
        add(label3,1);
        add(label4,2);
        add(label2,3);
        for(int x=1; x <= 9; x++){add(new ButtonNumber(x));}
        add(new ButtonNumber(0)); //I want to set 0 at last, so write out of loop
        add(new ButtonFunction("+"));
        add(new ButtonFunction("－"));
        add(new ButtonFunction("×"));
        add(new ButtonFunction("÷"));
        add(buttonEqual);
        add(buttonClear);

        buttonEqual.addActionListener(this);
        buttonEqual.addKeyListener(new KeyReaction());
        buttonClear.addActionListener(this);
        buttonClear.addKeyListener(new KeyReaction());
        addKeyListener(new KeyReaction());

        //window setting
        setLocationByPlatform(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 250);
        setVisible(true);
        this.setFocusable(true);
        this.setAlwaysOnTop(true);
    }

    //calculation function
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == buttonEqual) {
            int a = Integer.parseInt(label.getText());
            int b = Integer.parseInt(label2.getText());

            switch (func) {
                case "+" -> label2.setText(Integer.toString(a + b));
                case "－" -> label2.setText(Integer.toString(a - b));
                case "×" -> label2.setText(Integer.toString(a * b));
                case "÷" -> label2.setText(Integer.toString(a / b));
                default -> label2.setText(Integer.toString(0));
            }
            ResetFunction.Reset();
        }
        if (e.getSource() == buttonClear) {
            ClearFunction.Clear();
        }

    }

    //call the class
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();

    }

}


