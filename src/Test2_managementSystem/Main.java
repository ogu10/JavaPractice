import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        long start = 0;
        long stop = 0;
        long timeresult = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("aa");
        System.out.println("bb");
        System.out.println("Enter");
        String anykey = sc.nextLine();
        System.out.println("------------------------------");

        for(int i = 0; i < 4; i++) {
            start = System.nanoTime();
            Random rnd = new Random();
            int figure1 = rnd.nextInt(30) + 1;
            int figure2 = rnd.nextInt(30) + 1;
            int result = figure1 + figure2;
            System.out.println(figure1 + " + " + figure2 + " = ?");
            int a = sc.nextInt();
            if(result == a) {
                System.out.println("a");
                count++;
            } else {
                System.out.println("f");
            }
        }
        stop = System.nanoTime();
        System.out.println("------------------------------");
        timeresult = stop - start;
        double timesecond = timeresult / 100000000.0;
        BigDecimal bdt = new BigDecimal(String.valueOf(timesecond));
        BigDecimal bdt1 = bdt.setScale(2, RoundingMode.HALF_UP);
        System.out.println("正解数は" + count + "問でした。");
        System.out.println("解くのにかかった時間は" + bdt1 + "秒でした。");
    }
}