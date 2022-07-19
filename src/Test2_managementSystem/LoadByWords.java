package Test2_managementSystem;

import java.io.*;

public class LoadByWords {
    public static void geneByWords(String f){
        BufferedReader br = null;
        String file_name = f;
        /*System.out.println(file_name);*/
        final int MAX_DATA_NUMS = 8; //まあここはなんでも
        String[][] datum = new String[MAX_DATA_NUMS][];
        char[][] data = new char[MAX_DATA_NUMS][MAX_DATA_NUMS];


        try {
            File file = new File(file_name);
            br = new BufferedReader(new FileReader(file));
/*                    int index = 0;
                    int length = 0;
                    String line;
                    while ((line = br.readLine()) != null) {
                        datum[index] = line.split("");
                        index++;
                    }
                    for (int s=0;s<20;s++){
                        if (length < datum[s].length){
                            length = datum[s].length;
                        }
                    }
                    System.out.println(length);*/
            for (int i=0;i<8;i++) {
                int c;
                for (int j = 0; j < 8; j++) {
                    c = br.read();
                    while (c == 10 || c == 13) {
                        c = br.read();
                    }

                    if (c != -1) {
                        System.out.print((char) c);
                        data[i][j] = ((char) c);
                    }
                }
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
            }
            System.out.println();
        }
    }
}
