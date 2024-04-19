package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class bt13 extends JFrame implements KeyListener {
    JPanel main = new JPanel();
    JLabel label = new JLabel("HEHE");


    public void GUI () {
        main.add(label);
        addKeyListener(this);
//        txt.addKeyListener(this);
        main.setSize(300,300);
        label.setLocation(150,150);
        add(main);
        setSize(300,300);
        setVisible(true);

    }
    public bt13(){
        GUI();
    }

    public static void main(String[] args){
        bt13 bt = new bt13();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char ch = e.getKeyChar();
        label.setText("You typed " + Character.toString(ch));
    }

    @Override
    public void keyPressed(KeyEvent e) {
//        int ch = e.getKeyCode();
        char c = e.getKeyChar();
        label.setText("You pressed "+ Character.toString(c));
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int ch = e.getKeyChar();
        char c = (char)ch;
        label.setText("You released "+ Character.toString(c));

    }
}
//package org.example;
//import javax.swing.*;
//import java.awt.event.*;
//
//public class bt13 {
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Key Event Example");
//        JTextField textField = new JTextField(20);
//        JLabel label = new JLabel("HEHE");
//
//        textField.addKeyListener(new KeyListener() {
//            @Override
//            public void keyTyped(KeyEvent e) {
//                // Xử lý khi một ký tự được gõ
////                char keyChar = e.getKeyChar();
////                System.out.println("Key typed: " + keyChar);
////                label.setText(Character.toString(keyChar));
//            }
//
//            @Override
//            public void keyPressed(KeyEvent e) {
////                // Xử lý khi một phím được nhấn
////                int keyCode = e.getKeyCode();
////                System.out.println("Key pressed: " + keyCode);
////                label.setText(Integer.toString(keyCode));
//                int keyCode = e.getKeyCode();
//                String keyText = KeyEvent.getKeyText(keyCode);
//                label.setText("Pressed key: " + keyText);
//            }
//
//            @Override
//            public void keyReleased(KeyEvent e) {
//                // Xử lý khi một phím được thả ra
////                int keyCode = e.getKeyCode();
////                System.out.println("Key released: " + keyCode);
////                label.setText(Integer.toString(keyCode));
//            }
//        });
//        frame.add(label);
//        frame.setSize(300, 200);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//    }
//}
//import javax.swing.*;
//import java.awt.event.*;
//
//public class bt13 {
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Key Event Example");
//        JTextField textField = new JTextField(20);
//        JLabel label = new JLabel("Pressed key: ");
//
//
//        textField.addKeyListener(new KeyListener() {
//            @Override
//            public void keyTyped(KeyEvent e) {
//                // Không sử dụng trong ví dụ này
//            }
//
//            @Override
//            public void keyPressed(KeyEvent e) {
//                // Lấy thông tin về phím được nhấn và cập nhật nội dung của label
//                int keyCode = e.getKeyCode();
//                String keyText = KeyEvent.getKeyText(keyCode);
//                label.setText("Pressed key: " + keyText);
//            }
//
//            @Override
//            public void keyReleased(KeyEvent e) {
//                // Không sử dụng trong ví dụ này
//            }
//        });
//
//        JPanel panel = new JPanel();
////        panel.add(textField);
//        panel.add(label);
//
//        frame.add(panel);
//        frame.setSize(300, 200);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//    }
//}


