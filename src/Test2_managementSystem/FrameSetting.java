package Test2_managementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FrameSetting extends JFrame implements ActionListener {
    JLabel label;
    JButton button;
    JButton button1;
    JButton button2;
    int count = 0;
    public FrameSetting(){
        setSize(600,200);
        setLayout(new GridLayout(3,4));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        label = new JLabel(count + "clicks",JLabel.CENTER);
        button = new JButton("Click Me!");
        button1 = new JButton("1");
        button2 = new JButton("2");
        add(label);
        add(button);
        add(button1);
        add(button2);
        setLocationByPlatform(true);
        setVisible(true);
        button.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button) {
            count++;
            label.setText(count + "KAI-ME!");
        }
        if (e.getSource() == button1) {
            label.setText("1");
        }
    }

    public static void main(String[] args){
        FrameSetting frameIntro = new FrameSetting();
    }
}
