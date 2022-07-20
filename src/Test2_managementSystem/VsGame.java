package Test2_managementSystem;

import Test2_managementSystem.Past.Calculator.GameButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class VsGame extends JFrame {
    JLabel label;
    public static void main(String[] args) {
        VsGame frame = new VsGame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(10, 10, 600, 600);
        frame.setLocationByPlatform(true);
        frame.setTitle("Game×Game");
        frame.setVisible(true);
    }

    VsGame() {

        BufferedReader br = null;
        String file_name = "C:\\Users\\ogura.MYCOMPUTER\\IdeaProjects\\JavaPractice\\20-20-Array.txt";
        final int MAX_DATA_NUMS = 20; //まあここはなんでも
        String[][] data = new String[MAX_DATA_NUMS][MAX_DATA_NUMS];

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


        setLayout(new GridLayout(20, 20, 0, 0));
        for(int x=0; x < 20; x++){
            for(int y=0; y < 20; y++){
                String column;
                if (data[x][y] .equals("@")){column = "@";}
                else if (data[x][y] .equals("$")){column = "$";}
                else {column = "-";}
                add(new GameButton(column));
            }
        }
    }
}