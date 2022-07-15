package Test2_managementSystem.Past.FileTreatment;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOutput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        try {
            FileWriter fw = new FileWriter("C:/Users/ogura.MYCOMPUTER/IdeaProjects/JavaPractice/src/Test2_managementSystem/PyramidTest.txt");
            fw.write("Create "+n+"th Pyramid\n");
                for(int i=0;i<n;i++) {
                    for (int j = 0; j <= i; j++) {
                        fw.write("*");
                    }
                    fw.write("\n");
                }
                for (int k=n-2;k>=0;k--){
                    for (int l=0;l<=k;l++){
                        fw.write("*");
                    }
                    fw.write("\n");
                }
            fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}