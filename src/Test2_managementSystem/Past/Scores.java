package Test2_managementSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scores {
    static int count = 1;
    static int math;
    static int chemistry;
    static int physics;
    static int i;

    public static int inputFunc(String fname) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Input " + fname + " score!");
            return input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("use number please...");
            return Scores.inputFunc(fname);
        }
    }

    public static void sub() {
        System.out.println("\r");
        System.out.println("Input Scores of a new Student.");
    }

    public static void result() {
        math = Scores.inputFunc("math");
        chemistry = Scores.inputFunc("chemistry");
        physics = Scores.inputFunc("physics");
    }


    public static int calculate() {
        i = 2;
        if (math + chemistry + physics < 180) i = -1;
        if (math + chemistry + physics == 180) i = 0;
        if (math + chemistry + physics > 180) i = 1;
        return i;
    }

    public void output(int i, String name){

        switch (i) {
            case -1:
                System.out.println("\"" + name + "\"" + " has... \u001b[00;41mFailed.\u001b[00m");
                break;
            case 0:
                System.out.println("\"" + name + "\"" + " has... \u001b[00;46mSurvived!\u001b[00m");
                break;
            case 1:
                System.out.println("\"" + name + "\"" + " has... \u001b[00;42mPassed!!\u001b[00m");
                break;
            default:
                System.out.println("Invalid data");
        }

    }

    public void averages(int math, int chemistry, int physics){
        System.out.println("[Math] " + math);
        System.out.println("[Chemistry] " + chemistry);
        System.out.println("[Physics] " + physics);
        System.out.println("[Average] " + (math + chemistry + physics) / 3 + " (qualified by 60 points)");
    }

}
