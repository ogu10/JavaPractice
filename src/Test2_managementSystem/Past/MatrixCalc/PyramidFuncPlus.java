package Test2_managementSystem.MatrixCalc;

public class PyramidFuncPlus {
    public static void pyramidFuncPlus(int n){
        for(int i=0;i<=n;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void pyramidFuncMinus(int n){
        for (int k=n-1;k>=0;k--){
            for (int l=0;l<=k;l++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
