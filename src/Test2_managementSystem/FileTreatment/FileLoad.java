package Test2_managementSystem.FileTreatment;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileLoad extends JFrame implements ActionListener {

    JLabel label;


    public static void main(String[] args) {
        FileLoad frame = new FileLoad();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(10, 10, 300, 200);
        frame.setLocationByPlatform(true);
        frame.setTitle("Loadeeeeeeeeeeeeeeeeeeer");
        frame.setVisible(true);
    }

    FileLoad() {
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
                label.setText("You loaded " +file.getName());

                Path path = Paths.get(String.valueOf(file));
                String content = Files.readString(path);
//                System.out.println("path is " + path);
//                System.out.println("file is " + file);
                System.out.println(content);

            } catch (Exception ex) {
                label.setText("Error DA-A-YO");
                ex.printStackTrace();
            }

        }
    }
}