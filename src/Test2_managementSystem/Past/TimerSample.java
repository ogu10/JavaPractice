package Test2_managementSystem;

import java.util.Timer;
import java.util.TimerTask;

public class TimerSample{
    public int i = 0;
    public static void main(String[] args) {
        new TimerSample();
    }
    public TimerSample(){
        TimeStar star = new TimeStar(); //タイマータスクインスタンス作成
        Timer timer = new Timer(); //タイマーインスタンス作成
        System.out.println( "after 1sec");
        System.out.println( "show * by 1sec");
        //タイマー開始　5秒待って1秒ごとにタイマータスクstarを繰り返し
        timer.schedule(star, 1000,1000);

    }
    //TimerTask内部クラス
    class TimeStar extends TimerTask {
        public void run() {
            System.out.print("*");
            i++;
            if(i%10==0){
                System.out.println();
            }
            if(i==40) System.exit(0);
        }
    }
}