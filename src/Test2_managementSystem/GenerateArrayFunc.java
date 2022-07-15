package Test2_managementSystem;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class GenerateArrayFunc {
    public static void geneArray(String f){
        BufferedReader br = null;
        String file_name = f;
        final int MAX_DATA_NUMS = 100; //まあここはなんでも
        String[][] data = new String[MAX_DATA_NUMS][];
        try {
            File file = new File(file_name);
            br = new BufferedReader(new FileReader(file));

            int index = 0;
            String line;
            while ((line = br.readLine()) != null) {

                data[index] = line.split(",");
                index++;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        // display section
        for (int i = 0; i < MAX_DATA_NUMS; i++) {

            if (data[i] == null) break;
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
