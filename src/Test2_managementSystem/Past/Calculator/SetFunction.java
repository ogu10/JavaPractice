package Test2_managementSystem.Calculator;

import javax.swing.*;

public class SetFunction extends JFrame {
    public static void Set(String x) {
        MyCalculator.label.setText(Integer.toString(Integer.parseInt(MyCalculator.label2.getText())));
        MyCalculator.func = x;
        MyCalculator.label2.setText("0");
        MyCalculator.label3.setText(MyCalculator.func);
    }
}
