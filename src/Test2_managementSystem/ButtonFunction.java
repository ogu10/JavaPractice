package Test2_managementSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonFunction extends JButton implements ActionListener {
    //button setting
    public ButtonFunction(String buttonF) {
        super(buttonF);
        this.addActionListener(this);
    }
    //button function
    public void actionPerformed(ActionEvent e) {
        String buttonF = this.getText();
        CalculatorTest.label.setText(Integer.toString(Integer.parseInt(CalculatorTest.label2.getText())));
        CalculatorTest.func = buttonF;
        CalculatorTest.label2.setText(Integer.toString(0));
        CalculatorTest.label3.setText(CalculatorTest.func);
    }
}
