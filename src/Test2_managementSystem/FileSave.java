package Test2_managementSystem;
import javax.swing.*;
import java.io.File;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;

public class FileSave extends JFrame implements ActionListener{

    JLabel label;

    public static void main(String[] args){
        FileSave frame = new FileSave();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(10, 10, 300, 200);
        frame.setLocationByPlatform(true);
        frame.setTitle("Titleeeeeeeeee");
        frame.setVisible(true);
    }

    FileSave(){
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

    public void actionPerformed(ActionEvent e){
        JFileChooser filechooser = new JFileChooser();

        int selected = filechooser.showSaveDialog(this);
        if (selected == JFileChooser.APPROVE_OPTION){

            int n = 5;
            try {
                File file = filechooser.getSelectedFile();
                FileWriter fw = new FileWriter("TestDayo.txt");
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
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }else if (selected == JFileChooser.CANCEL_OPTION){
            label.setText("キャンセルされました");
        }else if (selected == JFileChooser.ERROR_OPTION){
            label.setText("エラー又は取消しがありました");
        }
    }

    public void actionPerformed(ActionEvent e){
        JFileChooser chooser = new JFileChooser();
        if (chooser.showSaveDialog(mainFrame) == JFileChooser.APPROVE_OPTION) {
            try {
                File file = chooser.getSelectedFile();
                Writer out = new OutputStreamWriter(new FileOutputStream(file), "utf-8");
                out.write(outputArea.getText());
                out.close();
            } catch (IOException exc) {
            }
        }
    }
}