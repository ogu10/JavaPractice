package Test2_managementSystem;

import javax.swing.*;
import java.io.*;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.util.Scanner;

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
                BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(fos));

                Scanner scan = new Scanner(System.in);
                int n = scan.nextInt();

                    fw.write("Create "+n+"th Pyramid\n");
                    for(int i=0;i<n;i++) {
                        for (int j = 0; j <= i; j++) {
                            fw.write("*");
                        }
                        fw.write("\n");
                    }
                    for (int k=n-2;k>=0;k--){
                        for (int l=0;l<=k;l++){
                            fw.write("*");
                        }
                        fw.write("\n");
                    }
                    fw.close();

            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
    }
}