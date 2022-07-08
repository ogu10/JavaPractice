package Test2_managementSystem;

import javax.swing.*;
import java.io.*;
import java.awt.BorderLayout;
import java.awt.event.*;

public class FileSave extends JFrame implements ActionListener {

    JLabel label;

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

        label = new JLabel();

        JPanel labelPanel = new JPanel();
        labelPanel.add(label);

        getContentPane().add(labelPanel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.PAGE_END);
    }

    public void actionPerformed(ActionEvent e) {
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
        int retrival = chooser.showSaveDialog(null);
        if (retrival == JFileChooser.APPROVE_OPTION) {
            try {

                File fout = new File(chooser.getSelectedFile() + ".txt");
                FileOutputStream fos = new FileOutputStream(fout);
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

                bw.write("sajan");
                bw.close();

            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
    }
}