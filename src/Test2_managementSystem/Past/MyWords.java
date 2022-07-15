package Test2_managementSystem.Past;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWords extends JFrame implements ActionListener {
    JTextField text1;
    JTextField text2;
    JLabel label;
    JButton button;

    public MyWords(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        text1 = new JTextField(10);
        text2 = new JTextField(10);
        label = new JLabel("",JLabel.RIGHT);
        button = new JButton("PLUS!");
        text1.setHorizontalAlignment(JTextField.RIGHT);
        text2.setHorizontalAlignment(JTextField.RIGHT);

        setLayout(new GridLayout(4,1,0,0));
        add(text1);
        add(text2);
        add(label);
        add(button);

        button.addActionListener(this);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button){
            label.setText(Double.toString(Double.parseDouble(text1.getText()) + Double.parseDouble(text2.getText())));
        }
    }

    public static void main(String[] args){
        MyWords myWords = new MyWords();
    }

}
