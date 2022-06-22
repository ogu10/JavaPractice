package Test2_managementSystem;
import java.util.InputMismatchException;
import java.util.Scanner;

public class scores {
    public static void main(String[] args){
        System.out.println("\r");
        System.out.println("Input Scores of a new Student.");
        Scanner nameInput = new Scanner(System.in);
        Scanner mathInput = new Scanner(System.in);
        Scanner chemistryInput = new Scanner(System.in);
        Scanner physicsInput = new Scanner(System.in);
        int count = 1;

        while (true){
        System.out.println("Type name of no."+count+" student!");
        System.out.println("If you wanna finish, press \"q\" button.");
        String name = nameInput.nextLine();
            if ("q".equals(name)) break;

        try {
            System.out.println("Input Math score!");
            int math = mathInput.nextInt();

            System.out.println("Input Chemistry score!");
            int chemistry = chemistryInput.nextInt();

            System.out.println("Input Physics score!");
            int physics = physicsInput.nextInt();

        System.out.println("\r");

        int i; i = 2;
        if (math + chemistry + physics < 180) i = -1;
        if (math + chemistry + physics == 180) i = 0;
        if (math + chemistry + physics > 180) i = 1;

        switch(i){
            case -1:
                System.out.println("\""+name+"\""+" has... \u001b[00;41mFailed.\u001b[00m");
                break;
            case 0:
                System.out.println("\""+name+"\""+" has... \u001b[00;46mSurvived!\u001b[00m");
                break;
            case 1:
                System.out.println("\""+name+"\""+" has... \u001b[00;42mPassed!!\u001b[00m");
                break;
            default:
                System.out.println("Invalid data");
            }

            System.out.println("[math] "+math);
            System.out.println("[chemistry] "+chemistry);
            System.out.println("[physics] "+physics);

        }catch(InputMismatchException e){
            System.out.println("\r");
            System.out.println("\u001b[00;31m--Suuji de Tanomu--\u001b[00m");
            /*System.out.println(e);*/
            break;
        }

        count++;
        System.out.println("\r");
        System.out.println("Then, Input Scores of another Student.");
        }

        System.out.println("\r");
        System.out.println("--bye bye--");
    }
}
