package Test2_managementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Test  extends JFrame implements KeyListener

{


    public void keyPressed(KeyEvent e) {
        System.out.println("keyPressed");
    }

    public void keyReleased(KeyEvent e) {

    }
    public void keyTyped(KeyEvent e) {
        System.out.println("keyTyped");
    }

    public Test(){

        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    public static void main(String[] args) {

                Test frame = new Test();
                frame.setTitle("Square Move Practice");
                frame.setResizable(false);
                frame.setSize(600, 600);
                frame.setMinimumSize(new Dimension(600, 600));
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               // frame.getContentPane().add(frame.draw);
                frame.pack();
                frame.setVisible(true);

    }
}
