package Test2_managementSystem;

import java.io.*;
import javax.swing.*;

public class GridData extends JFrame{

    public static String[][] data;

    public static String[][] loading(){
        BufferedReader br = null;
        String file_name = "C:\\Users\\ogura.MYCOMPUTER\\IdeaProjects\\JavaPractice\\20-20-Array.txt";
        final int MAX_DATA_NUMS = 20; //まあここはなんでも
        data = new String[MAX_DATA_NUMS][MAX_DATA_NUMS];

        try {
            File file = new File(file_name);
            br = new BufferedReader(new FileReader(file));

            for (int i=0;i<MAX_DATA_NUMS;i++) {
                int c;
                for (int j = 0; j < MAX_DATA_NUMS; j++) {
                    c = br.read();
                    while (c == 10 || c == 13) {
                        c = br.read();
                    }

                    if (c != -1) {
                        /*System.out.print((char) c);*/
                        data[i][j] = String.valueOf(((char) c));
                    }
                }
            }

        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);

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
        return data;
    }

}
