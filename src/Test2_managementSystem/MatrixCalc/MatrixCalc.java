package Test2_managementSystem.MatrixCalc;


public class MatrixCalc {
    public static long[][] matrixFormat(long[][] x,long[][] y){
        int rowLengthX = x.length;
        int columnLengthX = x[0].length;
        int rowLengthY = y.length;
        int columnLengthY = y[0].length;

        long[][] array = new long[rowLengthX][columnLengthY];
        for(int i=0;i<rowLengthX;i++) {
            for (int j = 0; j < columnLengthY; j++) {
                for (int k = 0; k < columnLengthX; k++) {
                    array[i][j] += x[i][k] * y[k][j];
                }
            }
        }
        return array;
    }
}
