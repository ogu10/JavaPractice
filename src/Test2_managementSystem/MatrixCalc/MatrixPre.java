package Test2_managementSystem.MatrixCalc;

import java.util.Scanner;

public class MatrixPre {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("decide your n,m,l");
        int n = scan.nextInt();
        int m = scan.nextInt();
        int l = scan.nextInt();

        long[][] a = new long[n][m];
        long[][] b = new long[m][l];
        long[][] c = new long[n][l];

        System.out.println("input A");
        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scan.nextInt();
            }
        }

        System.out.println("input B");
        for(int i=0;i<m;i++) {
            for (int j = 0; j < l; j++) {
                b[i][j] = scan.nextInt();
            }
        }

        for(int i=0;i<n;i++) {
            for (int j = 0; j < l; j++) {
                for (int k = 0; k < m; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

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
