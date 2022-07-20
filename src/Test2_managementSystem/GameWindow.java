package Test2_managementSystem;

import Test2_managementSystem.Past.Calculator.KeyReaction;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class GameWindow extends JFrame implements ActionListener {
    JLabel label;
    ImageIcon player = new ImageIcon("Test2_managementSystem/p.png");
    ImageIcon wall = new ImageIcon();
    ImageIcon diamond = new ImageIcon();

    String column;
    int xFixed;
    int yFixed;
    int downcount = 0;
    JButton buttonDown = new JButton("D");
    JButton buttonRight = new JButton("R");
    final int MAX_DATA_NUMS = 20; //まあここはなんでも
    JLabel[][] data = new JLabel[MAX_DATA_NUMS][MAX_DATA_NUMS];

    public static void main(String[] args) {
        GameWindow frame = new GameWindow();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(10, 10, 600, 600);
        frame.setLocationByPlatform(true);
        frame.setTitle("Game×Game2");
        frame.setVisible(true);
    }

    GameWindow() {

        BufferedReader br = null;
        String file_name = "C:\\Users\\ogura.MYCOMPUTER\\IdeaProjects\\JavaPractice\\20-20-Array.txt";

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
                        if ((char) c == '@') {
                            data[i][j].setIcon(player);
                        }else {
                            data[i][j].setIcon(player);
                        }
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


        setLayout(new GridLayout(21, 20, 0, 0));
/*        for(int x=0; x < 20; x++){
            for(int y=0; y < 20; y++){
                if (data[x][y] .equals("@")){
                    column = "@";
                    xFixed = x;
                    yFixed = y;
                }
                else if (data[x][y] .equals("$")){column = "$";}
                else {column = "-";}
                *//*add(new JLabel(column));*//*
            }
        }*/

        add(buttonDown);
        add(buttonRight);
        buttonDown.addActionListener(this);
        buttonRight.addActionListener(this);
        buttonDown.addKeyListener(new KeyReaction());
        buttonRight.addKeyListener(new KeyReaction());
        addKeyListener(new KeyReaction());
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == buttonDown){
            downcount++;
            data[xFixed][yFixed].setText("");
            data[xFixed][yFixed+downcount].setText("@");

        }
        System.out.println(xFixed);
        System.out.println(yFixed);
        System.out.println(downcount);
    }
}