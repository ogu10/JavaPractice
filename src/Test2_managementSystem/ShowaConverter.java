package Test2_managementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;


public class ShowaConverter extends JFrame implements ActionListener {
    static JTextField eraInput;
    static JTextField yearInput;
    static JTextField monthInput;
    static JTextField dayInput;
    static JButton buttonConvert;
    public static JLabel eraOutput;
    public static JLabel ageOutput;

    public ShowaConverter() {

        //calculation format
        eraInput = new JTextField(10);
        yearInput = new JTextField(10);
        monthInput = new JTextField(10);
        dayInput = new JTextField(10);
        eraOutput = new JLabel("", JLabel.RIGHT);
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
        for(int i=0;i<3;i++){add(new Labels(""));}
        add(buttonConvert);
        add(eraOutput);
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
        int eraOut = 2022;

        Calendar calendar = Calendar.getInstance();
        int yearThis = calendar.get(Calendar.YEAR);
        int monthThis = calendar.get(Calendar.MONTH) + 1;
        int dayThis = calendar.get(Calendar.DATE);
        int standard = yearThis - year;

        if (e.getSource() == buttonConvert) {
            if (month > monthThis || (month == monthThis && day > dayThis)) {
                switch (era) {
                    case "S" -> age = standard - 1926;
                    case "H" -> age = standard - 1989;
                    case "R" -> age = standard - 2019;
                    default -> age = standard;
                }
            } else {
                switch (era) {
                    case "S" -> age = standard - 1925;
                    case "H" -> age = standard - 1988;
                    case "R" -> age = standard - 2018;
                    default -> age = standard - 1;
                }
            }

            switch (era) {
                case "S" -> eraOut = year + 1925;
                case "H" -> eraOut = year + 1988;
                case "R" -> eraOut = year + 2018;
                default -> age = year;
            }
        }

        eraOutput.setText(Integer.toString(eraOut));
        ageOutput.setText(Integer.toString(age));
    }

    //call the class
    public static void main(String[] args) {
        ShowaConverter showa = new ShowaConverter();
    }

}


