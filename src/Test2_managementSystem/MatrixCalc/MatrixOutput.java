package Test2_managementSystem.MatrixCalc;

public class MatrixOutput {
    public static StringBuilder formatMatrix(long[][] x) {
        StringBuilder sb = new StringBuilder();
        int rowLength = x.length;
        int columnLength = x[0].length;
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < columnLength; j++) {
                sb.append(x[i][j]);
                if (j != columnLength - 1) sb.append(" ");
            }
            if (i != rowLength - 1) sb.append("\n");
        }
        return sb;
    }
}