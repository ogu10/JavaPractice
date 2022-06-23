package Test2_managementSystem;
import java.util.Scanner;

public class fortune {
    public static void main(String[] args){
        System.out.println("Choose number from 1 to 5!");
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int num = sc1.nextInt();
        int num2 = sc2.nextInt();


        switch(num*num2){
            case 3:
                System.out.println("win");
                break;
            default:
                System.out.println("Booooooo!!");
        }
    }
}
