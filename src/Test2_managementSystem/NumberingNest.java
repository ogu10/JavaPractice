package Test2_managementSystem;

import java.util.Scanner;

public class NumberingNest {
    static int[] random = new int[5];
    static int[] result = new int[5];


    public static void main(String[] args) {
        Scanner numberInput = new Scanner(System.in);
        NumberingNest echoNum = new NumberingNest();

        //initial message
        echoNum.initial();

        //add these numbers into an array
        for (int s = 0; s < random.length; s++){
            NumberingFunc.input(s+1);
        }

        //if loop to check smallest number of array
        echoNum.echo();

        //print it out
        echoNum.result();
        System.out.println("\n");

        //search func.
        Searching search = new Searching();
        search.search();
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

/*    public void firstDecision(){

        Scanner input = new Scanner(System.in);
        System.out.println("Decide length.");
        int length;
        length =  input.nextInt();
        int random[] = new int[length];
        int result[] = new int[length];
    }*/
}
