package Test2_managementSystem;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static Test2_managementSystem.GenerateArrayFunc.geneArray;
import static java.nio.charset.StandardCharsets.UTF_8;

public class SelectLoader extends JFrame implements ActionListener {
    JLabel label;
    public static void main(String[] args) {
        SelectLoader frame = new SelectLoader();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(10, 10, 300, 200);
        frame.setLocationByPlatform(true);
        frame.setTitle("Loadeeeeeeeeeeeeeeeeeeer");
        frame.setVisible(true);
    }

    SelectLoader() {
        JButton button = new JButton("select file to load");
        button.addActionListener(this);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(button);

        label = new JLabel("KON-NICHI-HA");
        JPanel labelPanel = new JPanel();
        labelPanel.add(label);
        getContentPane().add(labelPanel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e) {
        JFileChooser filechooser = new JFileChooser();
        filechooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
        int approveReaction = filechooser.showOpenDialog(null);
        if (approveReaction == JFileChooser.APPROVE_OPTION) {
            try {

                File file = filechooser.getSelectedFile();
                /*GenerateArrayFunc.geneArray(String.valueOf(file));*/
                LoadByWords.geneByWords(String.valueOf(file));

            } catch (Exception ex) {
                label.setText("Error DA-A-YO");
                ex.printStackTrace();
            }

        }
    }
}