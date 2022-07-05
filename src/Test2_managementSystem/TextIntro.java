package Test2_managementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TextIntro extends JFrame implements ActionListener {
    static JLabel label;
    static JLabel label2;
    static JLabel label3;
    static JLabel label4;
    JButton buttonEqual;
    JButton buttonClear;
    static String func;

    public TextIntro() {
        setLocationByPlatform(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        label = new JLabel("", JLabel.RIGHT);
        label2 = new JLabel("0", JLabel.RIGHT);
        label3 = new JLabel("", JLabel.RIGHT);
        label4 = new JLabel("", JLabel.RIGHT);
        buttonEqual = new JButton("=");
        buttonClear = new JButton("Clear");


        setLayout(new GridLayout(5, 4, 0, 0));
        add(label);
        add(label3);
        add(label4);
        add(label2);
        add(new ButtonNumber("1"));
        add(new ButtonNumber("2"));
        add(new ButtonNumber("3"));
        add(new ButtonNumber("4"));
        add(new ButtonNumber("5"));
        add(new ButtonNumber("6"));
        add(new ButtonNumber("7"));
        add(new ButtonNumber("8"));
        add(new ButtonNumber("9"));
        add(new ButtonNumber("0"));
        add(new ButtonFunction("+"));
        add(new ButtonFunction("－"));
        add(new ButtonFunction("×"));
        add(new ButtonFunction("÷"));
        add(buttonEqual);
        add(buttonClear);

        buttonEqual.addActionListener(this);
        buttonClear.addActionListener(this);
        setSize(300, 250);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == buttonEqual) {
            Double a = Double.parseDouble(label.getText());
            Double b = Double.parseDouble(label2.getText());

            switch (func) {
                case "+" -> label2.setText(Double.toString(a + b));
                case "－" -> label2.setText(Double.toString(a - b));
                case "×" -> label2.setText(Double.toString(a * b));
                case "÷" -> label2.setText(Double.toString(a / b));
                default -> label2.setText(Double.toString(0));
            }
            ResetFunction.Reset();
        }
        if (e.getSource() == buttonClear) {
            ClearFunction.Clear();
        }
    }

    public static void main(String[] args) {
        TextIntro textIntro = new TextIntro();
    }

}


