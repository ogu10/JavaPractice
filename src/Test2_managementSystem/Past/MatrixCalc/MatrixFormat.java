package Test2_managementSystem.MatrixCalc;
import java.util.Scanner;

public class MatrixFormat {
    public static long[][] matrixFormat(int s,int t){
        System.out.println("input new array");
        Scanner scan = new Scanner(System.in);

        long[][] array = new long[s][t];
        for(int i=0;i<s;i++) {
            for (int j = 0; j < t; j++) {
                array[i][j] = scan.nextInt();
            }
        }
        return array;
    }
}
