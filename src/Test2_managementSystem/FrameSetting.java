package Test2_managementSystem;

import javax.swing.*;
import java.awt.*;

public class FrameSetting extends JFrame{
    public FrameSetting(){
        setSize(600,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel label = new JLabel("clicks",JLabel.CENTER);
        JButton button = new JButton("Click Me!");
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        setLayout(new GridLayout(3,4));

        add(label);
        add(button);
        add(button1);
        add(button2);

        setLocationByPlatform(true);
        setVisible(true);
    }
    public static void main(String[] args){
        FrameSetting frameIntro = new FrameSetting();
    }
}
