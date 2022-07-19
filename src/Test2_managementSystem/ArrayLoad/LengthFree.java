package Test2_managementSystem;

import java.io.*;

public class LengthFree {
    public static void geneByWords(String f){
        BufferedReader br = null;
        String file_name = f;
        final int MAX_DATA_NUMS = 8; //まあここはなんでも
        char[][] data = new char[MAX_DATA_NUMS][MAX_DATA_NUMS];


        try {
            File file = new File(file_name);
            br = new BufferedReader(new FileReader(file));
            for (int i=0;i<8;) {
                int j = 0;
                int c = br.read();
                while (c != 10) {
                    while (c == 13) {
                        c = br.read();
                    }
                    if (c != -1) {
                        System.out.print((char) c);
                        data[i][j] = ((char) c);
                        j++;
                        c = br.read();
                    }
                }
                i++;
                System.out.println();
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

        System.out.println();
        System.out.println();

        // display section
        for (int i = 0; i < MAX_DATA_NUMS; i++) {

            if (data[i] == null) break;
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
                if (data[j] == null) break;
            }
            System.out.println();
        }
    }
}
