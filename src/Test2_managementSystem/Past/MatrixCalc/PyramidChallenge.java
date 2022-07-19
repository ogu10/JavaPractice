package Test2_managementSystem.Past.MatrixCalc;

import java.util.Scanner;

public class PyramidChallenge {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        PyramidFuncPlus.pyramidFuncPlus(n);
        PyramidFuncPlus.pyramidFuncMinus(n);
    }
}
