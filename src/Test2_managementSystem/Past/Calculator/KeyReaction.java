package Test2_managementSystem.Calculator;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyReaction implements KeyListener {

    @Override
    public void keyPressed(KeyEvent eve) {
        if (Character.getNumericValue(eve.getKeyChar()) ==  25){SetFunction.Set("+");}
        else if (Character.getNumericValue(eve.getKeyChar()) ==  22){SetFunction.Set("－");}
        else if (Character.getNumericValue(eve.getKeyChar()) ==  21){SetFunction.Set("×");}
        else if (Character.getNumericValue(eve.getKeyChar()) ==  13){SetFunction.Set("÷");}
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
        else if (Character.getNumericValue(eve.getKeyChar()) ==  26){ClearFunction.Clear();}
        else {int keyNum = Character.getNumericValue(eve.getKeyChar());
            MyCalculator.label2.setText(Integer.toString(Integer.parseInt(MyCalculator.label2.getText()) * 10 + keyNum));}
    }

    @Override
    public void keyTyped(KeyEvent e) {}
    @Override
    public void keyReleased(KeyEvent e) {}
}
