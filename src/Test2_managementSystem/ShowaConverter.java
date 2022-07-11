package Test2_managementSystem;

import Test2_managementSystem.MyTimer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class ShowaConverter extends JFrame implements ActionListener {
    static JTextField eraInput;
    static JTextField yearInput;
    static JTextField monthInput;
    static JTextField dayInput;
    static JLabel label2;
    static JLabel label3;
    public JLabel label4;
    JButton buttonConvert;
    public static JLabel ageOutput;
    static JLabel label5;
    static JLabel label6;
    public JLabel label7;
    static JLabel label8;
    static JLabel label9;
    public JLabel label0;
    public JLabel label1;

    public ShowaConverter() {

        //calculation format
        label0 = new JLabel("era", JLabel.RIGHT);
        label1 = new JLabel("year", JLabel.RIGHT);
        label8 = new JLabel("month", JLabel.RIGHT);
        label9 = new JLabel("day", JLabel.RIGHT);
        label2 = new JLabel("", JLabel.RIGHT);
        label3 = new JLabel("", JLabel.RIGHT);
        label4 = new JLabel("", JLabel.RIGHT);
        label5 = new JLabel("", JLabel.RIGHT);
        label6 = new JLabel("", JLabel.RIGHT);
        label7 = new JLabel("Age: ", JLabel.RIGHT);
        eraInput = new JTextField(10);
        yearInput = new JTextField(10);
        monthInput = new JTextField(10);
        dayInput = new JTextField(10);
        ageOutput = new JLabel("", JLabel.RIGHT);
        buttonConvert = new JButton("Go!");


        setLayout(new GridLayout(4, 4, 0, 0));
        add(label0);
        add(label1);
        add(label8);
        add(label9);
        add(eraInput);
        add(yearInput);
        add(monthInput);
        add(dayInput);
        add(label3);
        add(label2);
        add(label4);
        add(buttonConvert);
        add(label5);
        add(label6);
        add(label7);
        add(ageOutput);

        buttonConvert.addActionListener(this);
        //window setting
        setLocationByPlatform(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(320, 180);
        setTitle("Showa Converter");
        setVisible(true);
        this.setFocusable(true);
        this.setAlwaysOnTop(true);
    }

    //calculation function
    public void actionPerformed(ActionEvent e) {
        String era = String.valueOf(eraInput.getText());
        int year = Integer.parseInt(yearInput.getText());
        int month = Integer.parseInt(monthInput.getText());
        int age = 0;
        int monthThis = 7;

        if (e.getSource() == buttonConvert) {
            if (era == "S"){
                if(month >= monthThis){
                    age = 97 - year;
                }else{
                    age = 96 - year;
                }
            }else if(era == "H"){
                if(month >= monthThis){
                    age = 34 - year;
                }else{
                    age = 33 - year;
                }
            }else if(era == "R"){
                if(month >= monthThis){
                    age = 4 - year;
                }else{
                    age = 3 - year;
                }
            }else{
                if(month >= monthThis){
                    age = 2022 - year;
                }else{
                    age = 2022 - year;
                }
            }
        }

        ageOutput.setText(Integer.toString(age));
    }

    //call the class
    public static void main(String[] args) {
        ShowaConverter showa = new ShowaConverter();
    }

}


