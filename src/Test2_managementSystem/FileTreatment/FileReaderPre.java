package Test2_managementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileReaderPre extends JFrame implements ActionListener {

    JLabel label;


    public static void main(String[] args) {
        FileReaderPre frame = new FileReaderPre();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(10, 10, 300, 200);
        frame.setLocationByPlatform(true);
        frame.setTitle("FileReadeeeeer");
        frame.setVisible(true);
    }

    FileReaderPre() {
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

                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                String content;
                while((content = br.readLine()) != null){
                    System.out.println(content);
                }
                br.close();

            } catch (Exception ex) {
                label.setText("Error DA-A-YO");
                ex.printStackTrace();
            }

        }
    }
}