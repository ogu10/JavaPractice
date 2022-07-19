package Test2_managementSystem;

import Test2_managementSystem.ArrayLoad.LoadByWords;
import Test2_managementSystem.ArrayLoad.SelectLoader;
import Test2_managementSystem.Past.Calculator.ButtonNumber;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class GameWindow  extends JFrame {
    JLabel label;
    public static void main(String[] args) {
        GameWindow frame = new GameWindow();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(10, 10, 600, 600);
        frame.setLocationByPlatform(true);
        frame.setTitle("Game×Game");
        frame.setVisible(true);
    }

    GameWindow() {
        setLayout(new GridLayout(20, 20, 0, 0));
        for(int x=0; x < 20; x++){
            for(int y=0; y < 20; y++){
                String column = "a";
                GridData.loading();
                if (GridData.data[x][y] == "@"){column = "@";}
                if (GridData.data[x][y] == "$"){column = "$";}
                add(new JLabel(column));
            }
        }

/*        JButton button = new JButton("select file to load");

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(button);

        label = new JLabel("Game no JIKAN");
        JPanel labelPanel = new JPanel();
        labelPanel.add(label);
        getContentPane().add(labelPanel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);*/
    }

/*    public void actionPerformed(ActionEvent e) {
        JFileChooser filechooser = new JFileChooser();
        filechooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
        int approveReaction = filechooser.showOpenDialog(null);
        if (approveReaction == JFileChooser.APPROVE_OPTION) {
            try {

                File file = filechooser.getSelectedFile();
                GameTest.loading();

            } catch (Exception ex) {
                label.setText("Error DA-A-YO");
                ex.printStackTrace();
            }

        }
    }*/
}