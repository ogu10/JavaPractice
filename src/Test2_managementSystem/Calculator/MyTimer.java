package Test2_managementSystem;

import Test2_managementSystem.Calculator.MyCalculator;

import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class MyTimer extends JFrame{
    public int hour = 00;
    public int min = 00;
    public int sec = 00;
/*    static JLabel label;
    public static void main(String[] args){
        new MyTimer();
    }*/

    public void MyTimer(){
        TimeCounter timeCounter = new TimeCounter();
        Timer timer = new Timer();
        timer.schedule(timeCounter,500,1000);

/*
        label = new JLabel("");
        setLayout(new GridLayout(5,4));
        add(label);

        setLocationByPlatform(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 250);
        setVisible(true);*/
    }

    class TimeCounter extends TimerTask{
        public void run() {
            if (sec%60 == 0 & sec != 0){min++;
                sec = 0;}
            if (min%60 == 0 & min != 0){hour++;
                min = 0;}

            if(min<10 & sec<10){
                MyCalculator.label4.setText(hour+":0"+min+":0"+sec);
            }else if(min<10){
                MyCalculator.label4.setText(hour+":0"+min+":"+sec);
            }else if(sec<10){
                MyCalculator.label4.setText(hour+":"+min+":0"+sec);
            }else {
                MyCalculator.label4.setText(hour + ":" + min + ":" + sec);
            }
            sec++;
        }
    }
}
