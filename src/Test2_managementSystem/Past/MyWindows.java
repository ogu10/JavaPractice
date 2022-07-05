package Test2_managementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class MyWindows extends JFrame implements ActionListener {
    JLabel label;
    JLabel label2;
    JButton button;
    JButton buttonReduce;
    JButton buttonDelete;
    int count = 0;
    int reduction = 100;

    public MyWindows(){
        setSize(400,300);
        setLocation(200,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        label = new JLabel(count + "Click SHITE-MIRO",JLabel.CENTER);
        label2 = new JLabel(reduction + "Click SHITE-MIRO",JLabel.CENTER);
        button = new JButton("+ DA-YO");
        buttonReduce = new JButton("- DA-YO?");
        buttonDelete = new JButton("RESET!");
        setLayout((new BorderLayout()));
        add(label, BorderLayout.NORTH);
        add(label2, BorderLayout.SOUTH);
        add(button, BorderLayout.EAST);
        add(buttonReduce, BorderLayout.WEST);
        add(buttonDelete, BorderLayout.CENTER);
        setVisible(true);
        button.addActionListener(this);
        buttonReduce.addActionListener(this);
        buttonDelete.addActionListener(this);
    }


    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            count++;
            reduction--;
            label.setText((count + " clicks!!!!"));
            label2.setText((reduction + " remaining..."));
        }

        if(e.getSource() == buttonReduce){
            count--;
            reduction++;
            label.setText((count + " clicks!!!!"));
            label2.setText((reduction + " remaining..."));
        }

        if(e.getSource() == buttonDelete){
            count = 0;
            reduction = 100;
            label.setText((count + " clicks!!!!"));
            label2.setText((reduction + " remaining..."));
        }
    }


    public static void main(String[] args){
        MyWindows myWindows = new MyWindows();
    }
}
