package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class bt7 extends JFrame implements ActionListener {
    JTextField n1text = new JTextField();
    JTextField n2text = new JTextField();
    JTextField restext = new JTextField();
    JButton add, sub, multi, div, reset, exit;
    JLabel num1, num2, result, header;
    JPanel main, p_header, p_textfill, p_operation, p_tail;
    public void GUI() {
        main = new JPanel(new GridLayout(4,1));
        p_header = new JPanel(new FlowLayout());
        p_textfill = new JPanel(new GridLayout(3,2));
        p_operation = new JPanel(new FlowLayout());
        p_tail = new JPanel(new FlowLayout());

        header = new JLabel("Basic Operations");
        p_header.add(header);

        num1 = new JLabel("Number 1");
        num2 = new JLabel("Number 2");
        result = new JLabel("Result");
        restext.setEditable(false);
        p_textfill.add(num1);
        p_textfill.add(n1text);
        p_textfill.add(num2);
        p_textfill.add(n2text);
        p_textfill.add(result);
        p_textfill.add(restext);

        add = new JButton("Addition");
        sub = new JButton("Subtraction");
        multi = new JButton("Multiplication");
        div = new JButton("Division");
        add.addActionListener(this);
        sub.addActionListener(this);
        multi.addActionListener(this);
        div.addActionListener(this);

        p_operation.add(add);
        p_operation.add(sub);
        p_operation.add(multi);
        p_operation.add(div);

        reset = new JButton("Reset");
        reset.addActionListener(this);
        exit = new JButton("Exit");
        exit.addActionListener(this);
        p_tail.add(reset);
        p_tail.add(exit);

        main.add(p_header);
        main.add(p_textfill);
        main.add(p_operation);
        main.add(p_tail);

        add(main);
        setSize(500, 300);
        setVisible(true);
    }
    public bt7(){
        GUI();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == reset) {
            n1text.setText("");
            n2text.setText("");
            restext.setText("");
        } else if (e.getSource() == exit) {
            System.exit(0);
        }
        double a = Double.parseDouble(n1text.getText());
        double b = Double.parseDouble(n2text.getText());
        double c;
        if(e.getSource() == add) {
            c = a + b;
            restext.setText(Double.toString(c));
        } else if (e.getSource() == sub) {
            c = a - b;
            restext.setText(Double.toString(c));
        } else if (e.getSource() == multi) {
            c = a * b;
            restext.setText(Double.toString(c));
        } else if (e.getSource() == div) {
            if(a != 0 && b == 0) {
                JFrame Error = new JFrame("Math error!");
                JOptionPane.showMessageDialog(Error, "Phuong trinh vo nghiem");
            } else {
                c = a / b;
                restext.setText(Double.toString(c));
            }
        }

    }

    public static void main(String[] args) {
        bt7 b = new bt7();
    }

}
