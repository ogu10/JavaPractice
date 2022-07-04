package Test2_managementSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonN extends JButton implements ActionListener {
    public ButtonN(String buttonN){
        super(buttonN);
        this.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        TextIntro label2 = new TextIntro();
        String buttonN = this.getText();
        label2.setText(Double.toString(Double.parseDouble(label2.getText())*10 + 1));
    }
}
