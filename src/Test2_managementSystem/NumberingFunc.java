package Test2_managementSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberingFunc {

    public static void input(int num) {
        Numbering n = new Numbering();
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Input " + num + " number!");
            Numbering.random[num-1] =  input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("use number please...");
            NumberingFunc.input(num);
        }

    }

}
