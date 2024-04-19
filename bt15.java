package org.example;

import javax.swing.*;

public class bt15 extends JFrame{
    public void GUI(){
        JFrame frame = new JFrame();
        frame.setSize(400,300);
        JMenuBar menuBar = new JMenuBar();
        JMenu editMenu = new JMenu("Edit");
        JMenu file = new JMenu("File");
        JMenuItem Copy = new JMenuItem("Copy");
        JMenuItem Cut = new JMenuItem("Cut");
        JMenuItem Paste = new JMenuItem("Paste");
        JMenu option = new JMenu("Option");
        JMenuItem protect = new JMenuItem("Protected");
        JMenuItem first = new JMenuItem("First");
        JMenuItem second = new JMenuItem("Second");
        JMenuItem third = new JMenuItem("Third");

        editMenu.add(Copy);
        editMenu.add(Cut);
        editMenu.add(Paste);
        editMenu.add(option);
        editMenu.add(protect);

        option.add(first);
        option.add(second);
        option.add(third);

        menuBar.add(file);
        menuBar.add(editMenu);

        frame.setJMenuBar(menuBar);

        frame.setVisible(true);


    }

    public bt15(){
        GUI();
    }

    public static void main(String[] args) {
        bt15 bt = new bt15();
    }
}
