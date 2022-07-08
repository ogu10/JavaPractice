package Test2_managementSystem;

import javax.swing.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;

class CalcSample extends JFrame{
    private static final long serialVersionUID = 1L;
    BorderLayout borderLayout1 = new BorderLayout();
    JPanel contentPane = new JPanel();
    JTextField result = new JTextField("");
    double stackedValue = 0.0;
    boolean isStacked = false;
    boolean afterCalc = false;
    String currentOp = "";

    public static void main(String args[]){
        CalcSample frame = new CalcSample("Calculator");
        frame.setVisible(true);
    }

    CalcSample(String title){
        contentPane.setLayout(borderLayout1);
        setTitle(title);
        setSize(250, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(contentPane);

        contentPane.add(result, BorderLayout.NORTH);

        JPanel keyPanel = new JPanel();
        keyPanel.setLayout(new GridLayout(4, 4));
        contentPane.add(keyPanel, BorderLayout.CENTER);

        keyPanel.add(new NumberButton("7"), 0);
        keyPanel.add(new NumberButton("8"), 1);
        keyPanel.add(new NumberButton("9"), 2);
        keyPanel.add(new CalcButton("÷"), 3);
        keyPanel.add(new NumberButton("4"), 4);
        keyPanel.add(new NumberButton("5"), 5);
        keyPanel.add(new NumberButton("6"), 6);
        keyPanel.add(new CalcButton("×"), 7);
        keyPanel.add(new NumberButton("1"), 8);
        keyPanel.add(new NumberButton("2"), 9);
        keyPanel.add(new NumberButton("3"), 10);
        keyPanel.add(new CalcButton("-"), 11);
        keyPanel.add(new NumberButton("0"), 12);
        keyPanel.add(new CalcButton("."), 13);
        keyPanel.add(new CalcButton("+"), 14);
        keyPanel.add(new CalcButton("="), 15);

        contentPane.add(new ClearButton(), BorderLayout.SOUTH);
    }


    public void appendResult(String c) {
        if (!afterCalc)
            result.setText(result.getText() + c);
        else {
            result.setText(c);
            afterCalc = false;
        }
    }


    public class NumberButton extends JButton implements ActionListener {
        private static final long serialVersionUID = 1L;

        public NumberButton(String keyTop) {
            super(keyTop);
            this.addActionListener(this);
        }

        public void actionPerformed(ActionEvent evt) {
            String keyNumber = this.getText();
            appendResult(keyNumber);
        }
    }


    public class CalcButton extends JButton implements ActionListener {
        private static final long serialVersionUID = 1L;

        public CalcButton(String op) {
            super(op);
            this.addActionListener(this);
        }

        public void actionPerformed(ActionEvent e) {
            if (isStacked) {
                double resultValue = (Double.valueOf(result.getText()))
                        .doubleValue();
                if (currentOp.equals("+"))
                    stackedValue += resultValue;
                else if (currentOp.equals("-"))
                    stackedValue -= resultValue;
                else if (currentOp.equals("×"))
                    stackedValue *= resultValue;
                else if (currentOp.equals("÷"))
                    stackedValue /= resultValue;
                result.setText(String.valueOf(stackedValue));
            }
            currentOp = this.getText();
            stackedValue = (Double.valueOf(result.getText())).doubleValue();
            afterCalc = true;
            if (currentOp.equals("="))
                isStacked = false;
            else
                isStacked = true;
        }
    }


    public class ClearButton extends JButton implements ActionListener {

        private static final long serialVersionUID = 1L;

        public ClearButton() {
            super("C");
            this.addActionListener(this);
        }

        public void actionPerformed(ActionEvent evt) {
            stackedValue = 0.0;
            afterCalc = false;
            isStacked = false;
            result.setText("");
        }
    }
}