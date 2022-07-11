/*
package Test2_managementSystem;

import java.awt.*;
import java.awt.event.*;

class FileSaveRevenge extends WindowAdapter implements ActionListener {
    Frame frm = new Frame("Kitty on your lap");
    FileDialog fd;

    public static void main(String args[]) {
        FileSaveRevenge win = new FileSaveRevenge();
    }

    public FileSaveRevenge() {
        frm.setSize(400 , 200);
        frm.setLayout(new FlowLayout(FlowLayout.CENTER , 5 , 5));

        Button load = (Button)frm.add(new Button("LOAD"));
        load.addActionListener(this);
        Button save = (Button)frm.add(new Button("SAVE"));
        save.addActionListener(this);

        frm.setVisible(true);
        frm.addWindowListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "LOAD" )
            fd = new FileDialog(frm , "読み込みゃ" , FileDialog.LOAD);
        else fd = new FileDialog(frm , "書き込みゃ" , FileDialog.SAVE);
        fd.setVisible(true);
    }

    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}*/
