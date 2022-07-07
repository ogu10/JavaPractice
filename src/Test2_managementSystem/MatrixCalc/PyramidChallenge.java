package Test2_managementSystem.MatrixCalc;

import java.util.Scanner;

public class PyramidChallenge {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i=0;i<=n;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for (int k=n-1;k>=0;k--){
            for (int l=0;l<=k;l++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
