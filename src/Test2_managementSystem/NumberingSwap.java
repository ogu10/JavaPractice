package Test2_managementSystem;

import java.util.*;

public class NumberingSwap {
    static int[] random = new int[5];
    static int[] result = new int[5];


    public static void main(String[] args) {
        NumberingSwap NumberingSwap = new NumberingSwap();

        //initial message
        NumberingSwap.initial();

        //add these numbers into an array
        for (int s = 0; s < random.length; s++){
            NumberingSwap.input(s+1);
        }

        //if loop to check smallest number of array
        NumberingSwap.sort();

        //print it out
        NumberingSwap.result();
        System.out.println("\n");

        //search func.
        NumberingSwap.search();
    }





    public void sort() {
        for (int i = 0; i <= random.length - 1; i++) {
            for (int j = 0; j <= random.length - 1; j++) {
                if (random[i] > random[j]) {
                    Collections.swap(Arrays.asList(random),i,j);
                }
            }
        }
    }

    public void result(){

        System.out.print("The result is... ");
        for (int i = 0; i <= result.length-2; i++) {
            System.out.print(result[i] + ", ");
        }
        System.out.print(result[result.length-1] + "!");
    }

    public void initial(){
        System.out.println("\r");
        System.out.println("We will change the order of your 5 numbers.");
    }

    public void input(int num) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Input " + num + " number!");
            NumberingSwap.random[num-1] =  input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("use number please...");
            NumberingFunc.input(num);
        }

    }

    public void search() {

        int searchNum;
        int order = 9999;
        Scanner input = new Scanner(System.in);
        System.out.println("Input Searching number:)");
        searchNum =  input.nextInt();
        for (int i = 0; i <= NumberingSwap.random.length-1; i++){
            if (searchNum == NumberingSwap.random[i]){
                order = i+1;
            }
        }

        System.out.println("\r");
        if(order != 9999){
            System.out.println( searchNum + " is " + order + " BAN-ME-DESU.");
        }else{
            System.out.println("NAI-YO-IDIOT.");
        }
    }

}
