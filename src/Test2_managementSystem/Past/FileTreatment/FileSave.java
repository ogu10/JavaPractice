package Test2_managementSystem.Past.FileTreatment;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;

public class FileSave extends JFrame implements ActionListener {

    public static void main(String[] args) {
        FileSave frame = new FileSave();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(10, 10, 300, 200);
        frame.setLocationByPlatform(true);
        frame.setTitle("Titleeeeeeeeee");
        frame.setVisible(true);
    }

    FileSave() {
        JButton button = new JButton("file select");
        button.addActionListener(this);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(button);

        getContentPane().add(buttonPanel, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
        int retrival = chooser.showSaveDialog(null);
        if (retrival == JFileChooser.APPROVE_OPTION) {
            try {
                File fout = new File(chooser.getSelectedFile() + ".txt");
                FileOutputStream fos = new FileOutputStream(fout);
                BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(fos));

                    fw.write("CONTENTS NOW!!");
                    fw.close();

            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
    }
}