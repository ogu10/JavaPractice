package Test2_managementSystem.Calculator;

import javax.swing.*;

public class ResetFunction extends JFrame {
    public static void Reset() {
        MyCalculator.label.setText("");
        MyCalculator.func = "";
        MyCalculator.label3.setText("");
    }
}
