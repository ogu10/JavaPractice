package Test2_managementSystem;
import java.util.Scanner;

public class fortune {
    public static void main(String[] args){
        System.out.println("Choose number from 1 to 5!");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch(num){
            case 1:
            case 3:
            case 5:
                System.out.println("win");
                break;
            default:
                System.out.println("Booooooo!!");
        }
    }
}
