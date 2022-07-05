package Test2_managementSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonFunction extends JButton implements ActionListener {
    public ButtonFunction(String buttonF) {
        super(buttonF);
        this.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String buttonF = this.getText();
        TextIntro.label.setText(Double.toString(Double.parseDouble(TextIntro.label2.getText())));
        TextIntro.func = buttonF;
        TextIntro.label2.setText(Double.toString(0));
        TextIntro.label3.setText(TextIntro.func);
    }
}
