package Test2_managementSystem;

import java.io.*;
public class LoadArray {

    public static void main(String[] args) {
        BufferedReader br = null;
        String file_name = "trial.txt";
        try {
            File file = new File(file_name);
            br = new BufferedReader(new FileReader(file));

            String line;
            String[] data;

            while ((line = br.readLine()) != null) {
                data = line.split(",");
                for (int i = 0; i < data.length; i++) {
                    System.out.print(data[i] + "  ");}
                System.out.println();
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
    }
}