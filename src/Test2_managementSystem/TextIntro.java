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
 JButton buttonPlus;
 JButton buttonMinus;
 JButton buttonMultiple;
 JButton buttonDivide;
 JButton buttonEqual;
 JButton buttonClear;
 String func;

 public TextIntro(){
     setLocationByPlatform(true);
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     label = new JLabel("",JLabel.RIGHT);
     label2 = new JLabel("0",JLabel.RIGHT);
     label3 = new JLabel("",JLabel.RIGHT);
     label4 = new JLabel("",JLabel.RIGHT);
     buttonPlus = new JButton("+");
     buttonMinus = new JButton("－");
     buttonMultiple = new JButton("×");
     buttonDivide = new JButton("÷");
     buttonEqual = new JButton("=");
     buttonClear = new JButton("Clear");


     setLayout(new GridLayout(5,4,0,0));
     add(label);
     add(label3);
     add(label4);
     add(label2);
     add(new ButtonN("1"));
     add(new ButtonN("2"));
     add(new ButtonN("3"));
     add(new ButtonN("4"));
     add(new ButtonN("5"));
     add(new ButtonN("6"));
     add(new ButtonN("7"));
     add(new ButtonN("8"));
     add(new ButtonN("9"));
     add(new ButtonN("0"));
     add(buttonPlus);
     add(buttonMinus);
     add(buttonMultiple);
     add(buttonDivide);
     add(buttonEqual);
     add(buttonClear);

     buttonPlus.addActionListener(this);
     buttonMinus.addActionListener(this);
     buttonMultiple.addActionListener(this);
     buttonDivide.addActionListener(this);
     buttonEqual.addActionListener(this);
     buttonClear.addActionListener(this);
     setSize(300,250);
     setVisible(true);
 }

 public void actionPerformed(ActionEvent e){
     if(e.getSource() == buttonPlus) {
         label.setText(Double.toString(Double.parseDouble(label2.getText())));
         func = "+";
         label2.setText(Double.toString(0));
         label3.setText(func);
     }
     if(e.getSource() == buttonMinus) {
         label.setText(Double.toString(Double.parseDouble(label2.getText())));
         func = "－";
         label2.setText(Double.toString(0));
         label3.setText(func);
     }
     if(e.getSource() == buttonMultiple) {
         label.setText(Double.toString(Double.parseDouble(label2.getText())));
         func = "×";
         label2.setText(Double.toString(0));
         label3.setText(func);
     }
     if(e.getSource() == buttonDivide) {
         label.setText(Double.toString(Double.parseDouble(label2.getText())));
         func = "÷";
         label2.setText(Double.toString(0));
         label3.setText(func);
     }
     if(e.getSource() == buttonEqual) {
         if (func == "+") {
             label2.setText(Double.toString(Double.parseDouble(label.getText()) + Double.parseDouble(label2.getText())));
         }else if(func == "－") {
             label2.setText(Double.toString(Double.parseDouble(label.getText()) - Double.parseDouble(label2.getText())));
         }else if(func == "×"){
             label2.setText(Double.toString(Double.parseDouble(label.getText()) * Double.parseDouble(label2.getText())));
         }else if(func == "÷"){
             label2.setText(Double.toString(Double.parseDouble(label.getText()) / Double.parseDouble(label2.getText())));
         }else {
             label2.setText(Double.toString(0));
         }
         label.setText("");
         func = "";
         label3.setText("");
     }
     if(e.getSource() == buttonClear) {
         label.setText("");
         label2.setText(Double.toString(0));
         label3.setText("");
     }
 }

 public static void main(String[] args){
     TextIntro textIntro = new TextIntro();
 }


    public class ButtonN extends JButton implements ActionListener {
        public ButtonN(String buttonN){
            super(buttonN);
            this.addActionListener(this);
        }
        public void actionPerformed(ActionEvent e){
            String buttonN = this.getText();
            label2.setText(Double.toString(Double.parseDouble(label2.getText())*10 + Double.parseDouble(buttonN)));
        }
    }
}


