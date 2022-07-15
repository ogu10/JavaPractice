package Test2_managementSystem;

import java.io.*;

public class LoadByWords {
    public static void geneByWords(String f){
        BufferedReader br = null;
        String file_name = f;
        final int MAX_DATA_NUMS = 100; //まあここはなんでも
        String[][] data = new String[MAX_DATA_NUMS][];
        try {
            File file = new File(file_name);
            FileReader fr = new FileReader(file);
            String str = "";

            while (true) {
                int c = fr.read();
                if (c==-1) break;
                str += (char)c;
            }
            System.out.println(str);
            fr.close();
        } catch (IOException e) {
            System.out.println(e);
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
