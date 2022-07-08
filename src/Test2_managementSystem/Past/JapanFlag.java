package Test2_managementSystem;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.image.BufferedImage;

public class JapanFlag extends JFrame {
    private static final long serialVersionUID = 1L;
    public JapanFlag() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        g2.clearRect(0, 0, getWidth(), getHeight());
        BufferedImage bi = new BufferedImage(10,10,BufferedImage.TYPE_INT_RGB);
        Graphics2D bg = bi.createGraphics();
        Rectangle r = new Rectangle(0,0,10,10);
        bg.setColor(Color.RED);
        bg.fillRect(0, 0, 10, 10);
        TexturePaint tp = new TexturePaint(bi,r);
        g2.setPaint(tp);
        g2.fillOval(175, 135, 150, 150);
    }
    public static void main(String[] args) {
        JFrame f = new JapanFlag();
        f.setTitle("JAPAN");
        f.setSize(500,400);
        f.setBackground(Color.WHITE);
        f.setVisible(true);
    }
}