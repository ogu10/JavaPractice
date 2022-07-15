package Test2_managementSystem.MatrixCalc;

import java.util.Scanner;

public class MatrixPre {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("decide your n,m,l");
        int n = scan.nextInt();
        int m = scan.nextInt();
        int l = scan.nextInt();

        long[][] a = MatrixFormat.matrixFormat(n,m);
        long[][] b = MatrixFormat.matrixFormat(m,l);
        long[][] c = MatrixCalc.matrixFormat(a,b);

        StringBuilder sbA = MatrixOutput.formatMatrix(a);
        StringBuilder sbB = MatrixOutput.formatMatrix(b);
        StringBuilder sbC = MatrixOutput.formatMatrix(c);

        System.out.println("\n");
        System.out.println(sbA);
        System.out.println(" * ");
        System.out.println(sbB);
        System.out.println(" = ");
        System.out.println(sbC);
        scan.close();
    }


}
