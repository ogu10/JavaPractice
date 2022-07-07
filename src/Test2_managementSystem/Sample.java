package Test2_managementSystem;

import java.awt.*;
import java.text.*;
import java.util.*;
import java.util.Timer;

import javax.swing.*;


public class Sample extends JFrame{
    private static final long serialVersionUID = 1L;

    public static void main(String args[]) {
        Sample sample1 = new Sample();
        sample1.setBounds(100,100,300,200);
        sample1.setVisible(true);
    }

    public Sample() {
        TimeLabel label = new TimeLabel();
        this.add(label,BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class TimeLabel extends JLabel {
    private DateFormat format;

    public TimeLabel(){
        this.setFont(new Font("Dialog",Font.BOLD,24));
        format = new SimpleDateFormat("HH:mm:ss");
        Timer t = new Timer();
        t.schedule(new TimerLabelTask(), 0,1000);
    }

    public void setTime(){
        Calendar calendar = Calendar.getInstance(Locale.JAPAN);
        this.setText(format.format(calendar.getTime()));
    }

    class TimerLabelTask extends TimerTask {

        public void run(){
            setTime();
        }
    }

}
