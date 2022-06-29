package Test2_managementSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FreeLength {
    static int[] random = new int[10];
    static int[] result = new int[10];
    int n = 99;

    public static void main(String[] args) {
        FreeLength echoFF = new FreeLength();

        //add these numbers into an array
        for (int s = 0; s < random.length; s++) {
            echoFF.freeInput(s + 1);
            FreeLength.random[s] = echoFF.n;
            if (echoFF.n == 0) {
                break;
            }
        }

        //if loop to check smallest number of array
        echoFF.echo();

        //print it out
        echoFF.result();
        System.out.println("\n");

    }


    public int freeInput(int num) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Input " + num + " number!");
        return n;
    }

    public void echo() {
        for (int i = 0; i <= random.length - 1; i++) {
            int k = 0;
            for (int j = 0; j <= random.length - 1; j++) {
                if (random[i] > random[j]) {
                    k = k + 1;
                }
            }
            result[k] = random[i];
        }
    }

    public void result() {

        System.out.print("The result is... ");
        for (int i = 0; i <= result.length - 2; i++) {
            System.out.print(result[i] + ", ");
        }
        System.out.print(result[result.length - 1] + "!");
    }
}