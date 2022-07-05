package Test2_managementSystem;

import java.util.Scanner;

public class Conductor {
    public static void main(String[] args) {
        Scanner nameInput = new Scanner(System.in);
        Scores conductor = new Scores();
        Scores.sub();
        while (true) {
            System.out.println("Type name of no." + Scores.count + " student!");
            System.out.println("If you wanna finish, press \"q\" button.");
            String name = nameInput.nextLine();
            if ("q".equals(name)) break;

            Scores.result();
            Scores.i = Scores.calculate();
            conductor.output(Scores.i, name);
            conductor.averages(Scores.math,Scores.chemistry,Scores.physics);

            Scores.count++;
            System.out.println("\r");
            System.out.println("Then, Input Scores of another Student.");
        }

        System.out.println("\r");
        System.out.println("--bye bye--");


    }
}
