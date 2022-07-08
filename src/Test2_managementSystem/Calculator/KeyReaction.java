package Test2_managementSystem.Calculator;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyReaction implements KeyListener {

    @Override
    public void keyPressed(KeyEvent eve) {
        /*System.out.println("pressed");*/

        if (Character.getNumericValue(eve.getKeyChar()) ==  25){
            MyCalculator.label.setText(Integer.toString(Integer.parseInt(MyCalculator.label2.getText())));
            MyCalculator.func = "+";
            MyCalculator.label2.setText("0");
            MyCalculator.label3.setText(MyCalculator.func);
        }
        else if (Character.getNumericValue(eve.getKeyChar()) ==  22){
            MyCalculator.label.setText(Integer.toString(Integer.parseInt(MyCalculator.label2.getText())));
            MyCalculator.func = "－";
            MyCalculator.label2.setText("0");
            MyCalculator.label3.setText(MyCalculator.func);
        }
        else if (Character.getNumericValue(eve.getKeyChar()) ==  21){
            MyCalculator.label.setText(Integer.toString(Integer.parseInt(MyCalculator.label2.getText())));
            MyCalculator.func = "×";
            MyCalculator.label2.setText("0");
            MyCalculator.label3.setText(MyCalculator.func);
        }
        else if (Character.getNumericValue(eve.getKeyChar()) ==  13){
            MyCalculator.label.setText(Integer.toString(Integer.parseInt(MyCalculator.label2.getText())));
            MyCalculator.func = "%";
            MyCalculator.label2.setText("0");
            MyCalculator.label3.setText(MyCalculator.func);
        }
        else if (Character.getNumericValue(eve.getKeyChar()) ==  -1){
            int a = Integer.parseInt(MyCalculator.label.getText());
            int b = Integer.parseInt(MyCalculator.label2.getText());

            switch (MyCalculator.func) {
                case "+" -> MyCalculator.label2.setText(Integer.toString(a + b));
                case "－" -> MyCalculator.label2.setText(Integer.toString(a - b));
                case "×" -> MyCalculator.label2.setText(Integer.toString(a * b));
                case "÷" -> MyCalculator.label2.setText(Integer.toString(a / b));
                default -> MyCalculator.label2.setText(Integer.toString(0));
            }
            ResetFunction.Reset();
        }
        else if (Character.getNumericValue(eve.getKeyChar()) ==  26){
            ClearFunction.Clear();
        }
        else {
            int keyNum = Character.getNumericValue(eve.getKeyChar());
            MyCalculator.label2.setText(Integer.toString(Integer.parseInt(MyCalculator.label2.getText()) * 10 + keyNum));
        }


    }


    @Override
    public void keyTyped(KeyEvent e) {

    }
    @Override
    public void keyReleased(KeyEvent e) {

    }
}
