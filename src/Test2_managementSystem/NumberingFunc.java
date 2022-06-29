package Test2_managementSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberingFunc {

    public static int input(int num) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Input " + num + " number!");
            return input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("use number please...");
            return NumberingFunc.input(num);
        }

    }

}
