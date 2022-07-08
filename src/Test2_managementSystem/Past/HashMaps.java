package Test2_managementSystem;

import java.util.*;


public class HashMaps {



    public static int inputFunc(String fname) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Input " + fname + " score!");
            return input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("use number please...");
            return HashMaps.inputFunc(fname);
        }
    }


    public static void main(String[] args){
        HashMap<String,Integer> passedStudents = new HashMap<String,Integer>();


        System.out.println("\r");
        System.out.println("Input Scores of a new Student.");
        Scanner nameInput = new Scanner(System.in);
        int count = 1;
        int math;
        int chemistry;
        int physics;
        int average;

        while (true) {
            System.out.println("Type name of no." + count + " student!");
            System.out.println("If you wanna finish, press \"q\" button.");
            String name = nameInput.nextLine();
            if ("q".equals(name)) break;

            math = HashMaps.inputFunc("math");
            chemistry = HashMaps.inputFunc("chemistry");
            physics = HashMaps.inputFunc("physics");
            average = (math + chemistry + physics) / 3;

            System.out.println("\r");

            int i;
            i = 2;
            if (math + chemistry + physics < 180) i = -1;
            if (math + chemistry + physics == 180) i = 0;
            if (math + chemistry + physics > 180) i = 1;

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

            passedStudents.put(name, average);

            average = (math + chemistry + physics) / 3;
            System.out.println("[Math] " + math);
            System.out.println("[Chemistry] " + chemistry);
            System.out.println("[Physics] " + physics);
            System.out.println("[Average] " + average + " (qualified by 60 points)");
            System.out.println("\u001b[00;36mStudents Scores are... ");
            for (String t : passedStudents.keySet()) {
                System.out.println(t + " (average: " + passedStudents.get(t) + ")");
            }
            System.out.println("\u001b[00m");

            count++;
            System.out.println("\r");
            System.out.println("Then, Input Scores of another Student.");
        }

        System.out.println("\r");
        System.out.println("--bye bye--");


    }
}
