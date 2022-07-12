package Test2_managementSystem;

import Test2_managementSystem.Calculator.Labels;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ShowaConverter extends JFrame implements ActionListener {
    static JTextField eraInput;
    static JTextField yearInput;
    static JTextField monthInput;
    static JTextField dayInput;
    static JButton buttonConvert;
    public static JLabel ageOutput;

    public ShowaConverter() {

        //calculation format
        eraInput = new JTextField(10);
        yearInput = new JTextField(10);
        monthInput = new JTextField(10);
        dayInput = new JTextField(10);
        ageOutput = new JLabel("", JLabel.RIGHT);
        buttonConvert = new JButton("Check!");


        setLayout(new GridLayout(4, 4, 0, 0));
        add(new Labels("era"));
        add(new Labels("year"));
        add(new Labels("month"));
        add(new Labels("day"));
        add(eraInput);
        add(yearInput);
        add(monthInput);
        add(dayInput);
        add(new Labels(""));
        add(new Labels(""));
        add(new Labels(""));
        add(buttonConvert);
        add(new Labels(""));
        add(new Labels(""));
        add(new Labels("Age: "));
        add(ageOutput);

        buttonConvert.addActionListener(this);
        //window setting
        setLocationByPlatform(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(320, 200);
        setTitle("\"Showa Converter\"");
        setVisible(true);
        this.setFocusable(true);
        this.setAlwaysOnTop(true);
    }

    //calculation function
    public void actionPerformed(ActionEvent e) {
        String era = String.valueOf(eraInput.getText());
        int year = Integer.parseInt(yearInput.getText());
        int month = Integer.parseInt(monthInput.getText());
        int day = Integer.parseInt(dayInput.getText());
        int age = 0;
        int monthThis = 7;
        int dayThis = 12;

        if (e.getSource() == buttonConvert) {
            if (era.equals("S")){
                if(month >= monthThis && day >= dayThis){
                    age = 96 - year;
                }else{
                    age = 97 - year;
                }
            }else if(era.equals("H")){
                if(month >= monthThis && day >= dayThis){
                    age = 33 - year;
                }else{
                    age = 34 - year;
                }
            }else if(era.equals("R")){
                if(month >= monthThis && day >= dayThis){
                    age = 3 - year;
                }else{
                    age = 4 - year;
                }
            }else{
                if(month >= monthThis && day >= dayThis){
                    age = 2021 - year;
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


