package Test2_managementSystem.Calculator;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyReaction implements KeyListener {

    @Override
    public void keyPressed(KeyEvent eve) {
        System.out.println("pressed");
        int keyNum = Character.getNumericValue(eve.getKeyChar());
        MyCalculator.label2.setText(Integer.toString(Integer.parseInt(MyCalculator.label2.getText()) * 10 + keyNum));
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }
    @Override
    public void keyReleased(KeyEvent e) {

    }
}
