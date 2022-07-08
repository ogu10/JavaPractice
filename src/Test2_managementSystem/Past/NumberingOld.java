//package Test2_managementSystem;
//
//import java.util.Scanner;
//
//public class Numbering {
//    int smallest = 9999;
//    int smallest1;
//    static int[] random = new int[5];
//
//    public static void main(String[] args) {
//        Scanner numberInput = new Scanner(System.in);
//        Numbering echoNum = new Numbering();
//        System.out.println("We will change the order of your 5 numbers.");
//        System.out.println("\r");
//        //read 5 numbers of users input and insert it into variables "number1" ~ "number5"
//        //add these numbers into an array
//        for(int s = 0; s < random.length; s++){
//            NumberingFunc.input(s+1);
//        }
//
//        //if loop to check smallest number of array
//        //check one by one and if new one is smaller, override "smallestNumber", and after checking all, insert it into "smallest1"
//        echoNum.echo(echoNum.smallest,echoNum.smallest1);
//        //remove smallest one
//
//        //if loop to check second smallest, and insert it into "smallest2", and remove it from the array
//        //if loop to check third smallest
//        //if loop to check fourth smallest
//        //if loop to check fifth smallest
//
//
//        //add these into an array
//        //print it out
//    }
//
//
//    public void echo(int smallest,int smallest1){
//        int smallestOrder = 0;
//        for (int i = 0; i <= random.length-1; i++){
//            if (smallest > random[i]){
//                smallest = random[i];
//                smallestOrder = i;
//            }
//        }
//        smallest1 = smallest;
//        System.out.println(smallest + " is Smallest");
//        System.out.println(smallestOrder + 1 + " BAN-ME");
//    }
//}
