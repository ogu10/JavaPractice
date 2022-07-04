package Test2_managementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TextIntro extends JFrame implements ActionListener{
 JLabel label;
 JLabel label2;
 JLabel label3;
 JLabel label4;
 JButton button1;
 JButton button2;
 JButton button3;
 JButton button4;
 JButton button5;
 JButton button6;
 JButton button7;
 JButton button8;
 JButton button9;
 JButton button0;
 JButton buttonPlus;
 JButton buttonEqual;
 JButton buttonClear;


 public TextIntro(){
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     label = new JLabel("",JLabel.RIGHT);
     label2 = new JLabel("0",JLabel.RIGHT);
     label3 = new JLabel("",JLabel.RIGHT);
     label4 = new JLabel("",JLabel.RIGHT);
     button1 = new JButton("1");
     button2 = new JButton("2");
     button3 = new JButton("3");
     button4 = new JButton("4");
     button5 = new JButton("5");
     button6 = new JButton("6");
     button7 = new JButton("7");
     button8 = new JButton("8");
     button9 = new JButton("9");
     button0 = new JButton("0");
     buttonPlus = new JButton("+");
     buttonEqual = new JButton("=");
     buttonClear = new JButton("Clear");


     setLayout(new GridLayout(5,4,0,0));
     add(label3);
     add(label);
     add(label4);
     add(label2);
     add(button1);
     add(button2);
     add(button3);
     add(button4);
     add(button5);
     add(button6);
     add(button7);
     add(button8);
     add(button9);
     add(button0);
     add(buttonPlus);
     add(buttonEqual);
     add(buttonClear);

     button1.addActionListener(this);
     button2.addActionListener(this);
     button3.addActionListener(this);
     button4.addActionListener(this);
     button5.addActionListener(this);
     button6.addActionListener(this);
     button7.addActionListener(this);
     button8.addActionListener(this);
     button9.addActionListener(this);
     button0.addActionListener(this);
     buttonPlus.addActionListener(this);
     buttonEqual.addActionListener(this);
     buttonClear.addActionListener(this);
     pack();
     setVisible(true);
 }

 public void actionPerformed(ActionEvent e){
     if(e.getSource() == button1) {
         label2.setText(Double.toString(Double.parseDouble(label2.getText())*10 + 1));
     }
     if(e.getSource() == button2) {
         label2.setText(Double.toString(Double.parseDouble(label2.getText())*10 + 2));
     }
     if(e.getSource() == button3) {
         label2.setText(Double.toString(Double.parseDouble(label2.getText())*10 + 3));
     }
     if(e.getSource() == button4) {
         label2.setText(Double.toString(Double.parseDouble(label2.getText())*10 + 4));
     }
     if(e.getSource() == button5) {
         label2.setText(Double.toString(Double.parseDouble(label2.getText())*10 + 5));
     }
     if(e.getSource() == button6) {
         label2.setText(Double.toString(Double.parseDouble(label2.getText())*10 + 6));
     }
     if(e.getSource() == button7) {
         label2.setText(Double.toString(Double.parseDouble(label2.getText())*10 + 7));
     }
     if(e.getSource() == button8) {
         label2.setText(Double.toString(Double.parseDouble(label2.getText())*10 + 8));
     }
     if(e.getSource() == button9) {
         label2.setText(Double.toString(Double.parseDouble(label2.getText())*10 + 9));
     }
     if(e.getSource() == button0) {
         label2.setText(Double.toString(Double.parseDouble(label2.getText())*10 + 0));
     }
     if(e.getSource() == buttonPlus) {
         label.setText(Double.toString(Double.parseDouble(label2.getText())));
         label2.setText(Double.toString(0));
     }
     if(e.getSource() == buttonEqual) {
         label2.setText(Double.toString(Double.parseDouble(label.getText())) + Double.parseDouble(label2.getText()));
         label.setText(Double.toString(0));
     }
     if(e.getSource() == buttonClear) {
         label.setText(Double.toString(0));
         label2.setText(Double.toString(0));
     }
 }

 public static void main(String[] args){
     TextIntro textIntro = new TextIntro();
 }
}

