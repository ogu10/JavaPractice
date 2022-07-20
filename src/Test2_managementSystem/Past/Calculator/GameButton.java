package Test2_managementSystem.Past.Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameButton extends JButton implements ActionListener {
    //button setting
    public GameButton(String buttonF) {
        super(buttonF);
        this.addActionListener(this);
        addKeyListener(new KeyReaction());
    }
    //button function
    public void actionPerformed(ActionEvent e) {
        String buttonF = this.getText();
        MyCalculator.label.setText(Integer.toString(Integer.parseInt(MyCalculator.label2.getText())));
        MyCalculator.func = buttonF;
        MyCalculator.label2.setText("0");
        MyCalculator.label3.setText(MyCalculator.func);
    }
}
