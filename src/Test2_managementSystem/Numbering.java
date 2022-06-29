package Test2_managementSystem;

import java.util.Scanner;

public class Numbering {
    static int number1;
    static int number2;
    static int number3;
    static int number4;
    static int number5;
    int smallest = 9999;
    int smallest1;
    int i = 0;
    static int[] random = new int[5];

    public static void main(String[] args) {
        Scanner numberInput = new Scanner(System.in);
        Numbering echoNum = new Numbering();
        System.out.println("We will change the order of your 5 numbers.");
        System.out.println("\r");
        //read 5 numbers of users input and insert it into variables "number1" ~ "number5"
            //message "type 1st number"
            number1 = NumberingFunc.input(1);
            number2 = NumberingFunc.input(2);
            number3 = NumberingFunc.input(3);
            number4 = NumberingFunc.input(4);
            number5 = NumberingFunc.input(5);

        //add these numbers into an array
            random[0] = number1;
            random[1] = number2;
            random[2] = number3;
            random[3] = number4;
            random[4] = number5;

        echoNum.echo(echoNum.i,echoNum.smallest,echoNum.smallest1);
        //if loop to check smallest number of array
            //check one by one and if new one is smaller, override "smallestNumber", and after checking all, insert it into "smallest1"

        //remove smallest one

        //if loop to check second smallest, and insert it into "smallest2", and remove it from the array
        //if loop to check third smallest
        //if loop to check fourth smallest
        //if loop to check fifth smallest


        //add these into an array
        //print it out
    }

    public void echo(int i,int smallest,int smallest1){
        int smallestOrder = 0;
        while (i <= random.length-1){
            if (smallest > random[i]){
                smallest = random[i];
                smallestOrder = i;
            }
            i = i + 1;
        }
        smallest1 = smallest;
        System.out.println(smallest);
        System.out.println(smallestOrder + 1 + " BAN-ME");
    }
}
