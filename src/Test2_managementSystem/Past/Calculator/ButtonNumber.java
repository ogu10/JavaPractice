package Test2_managementSystem.Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ButtonNumber extends JButton implements ActionListener {
    //button setting
    public ButtonNumber(int buttonN) {
        super(Integer.toString(buttonN));
        this.addActionListener(this);
        addKeyListener(new KeyReaction());
    }
    //button function
    public void actionPerformed(ActionEvent e) {
        String buttonN = this.getText();
        MyCalculator.label2.setText(Integer.toString(Integer.parseInt(MyCalculator.label2.getText()) * 10 + Integer.parseInt(buttonN)));
    }

}
