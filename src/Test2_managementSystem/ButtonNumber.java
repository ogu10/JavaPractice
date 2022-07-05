package Test2_managementSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonNumber extends JButton implements ActionListener {
    public ButtonNumber(String buttonN) {
        super(buttonN);
        this.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String buttonN = this.getText();
        TextIntro.label2.setText(Double.toString(Double.parseDouble(TextIntro.label2.getText()) * 10 + Double.parseDouble(buttonN)));
    }
}
