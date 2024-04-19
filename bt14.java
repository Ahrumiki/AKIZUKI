package org.example;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class bt14 extends JFrame implements MouseListener {
    public void GUI() {
        JPanel main = new JPanel();
        addMouseListener(this);
        add(main);
        setSize(400,400);
        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse clicked at: " + e.getX() + ", " + e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse pressed at: " + e.getX() + ", " + e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse released at: " + e.getX() + ", " + e.getY());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse entered at: " + e.getX() + ", " + e.getY());
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse exited at: " + e.getX() + ", " + e.getY());
    }

    public bt14(){
        GUI();
    }

    public static void main(String[] args) {
        bt14 bt = new bt14();
    }
}
