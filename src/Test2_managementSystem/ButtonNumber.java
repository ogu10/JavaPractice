package Test2_managementSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonNumber extends JButton implements ActionListener {
    //button setting
    public ButtonNumber(int buttonN) {
        super(Integer.toString(buttonN));
        this.addActionListener(this);
    }
    //button function
    public void actionPerformed(ActionEvent e) {
        String buttonN = this.getText();
        CalculatorTest.label2.setText(Integer.toString(Integer.parseInt(CalculatorTest.label2.getText()) * 10 + Integer.parseInt(buttonN)));
    }
}
