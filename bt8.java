package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class bt8 extends JFrame implements ActionListener {
    JPanel main, p_button;
    JButton red, green, blue, exit;

    public void GUI(){
        main = new JPanel(new BorderLayout());
        p_button = new JPanel(new GridLayout(1,4));
        red = new JButton("Red");
        green = new JButton("Green");
        blue = new JButton("Blue");
        exit = new JButton("Exit");
        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);
        exit.addActionListener(this);

        p_button.add(red);
        p_button.add(green);
        p_button.add(blue);
        p_button.add(exit);

        main.add(p_button, BorderLayout.SOUTH);
        add(main);
        setSize(500,300);
        setVisible(true);
    }

    public bt8() {
        GUI();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == red) {
            main.setBackground(Color.RED);
        } else if (e.getSource() == green) {
            main.setBackground(Color.GREEN);
        } else if (e.getSource() == blue) {
            main.setBackground(Color.BLUE);
        } else if (e.getSource() == exit) {
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        bt8 bt = new bt8();
    }
}
