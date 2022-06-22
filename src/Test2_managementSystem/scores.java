package Test2_managementSystem;
import java.util.Scanner;

public class scores {
    public static void main(String[] args){
        System.out.println("Input Scores of new Student.");
        Scanner nameInput = new Scanner(System.in);
        Scanner mathInput = new Scanner(System.in);
        Scanner chemistryInput = new Scanner(System.in);
        Scanner physicsInput = new Scanner(System.in);

        System.out.println("Type name of student!");
        String name = nameInput.nextLine();

        System.out.println("Input Math score!");
        int math = mathInput.nextInt();

        System.out.println("Input Chemistry score!");
        int chemistry = chemistryInput.nextInt();

        System.out.println("Input Physics score!");
        int physics = physicsInput.nextInt();


        System.out.println("\r");
        System.out.println(name+" has... ");

        int i; i = 2;
        if (math + chemistry + physics < 180) i = -1;
        if (math + chemistry + physics == 180) i = 0;
        if (math + chemistry + physics > 180) i = 1;

        switch(i){
            case -1:
                System.out.println("Failed");
                break;
            case 0:
                System.out.println("Survived");
                break;
            case 1:
                System.out.println("Passed");
                break;
            default:
                System.out.println("Invalid data");
        }
    }
}
