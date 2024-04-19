package org.example;

import javax.print.Doc;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class bt9 extends JFrame implements ActionListener {
    public void GUI() {
        JLabel string, uppercase, lowercase, lowerUpper, number;
        JTextField stringText, upperText, lowerText, LUText, numberText;
        JButton ok, reset, exit;
        JPanel main, p_button, p_text;

        stringText = new JTextField();
        upperText = new JTextField();
        upperText.setEditable(false);
        lowerText = new JTextField();
        lowerText.setEditable(false);
        LUText = new JTextField();
        LUText.setEditable(false);
        numberText = new JTextField();
        numberText.setEditable(false);
        main = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
//        gbc.weightx = 1.0;


        gbc.gridwidth = 5;

        string = new JLabel("Enter a string");
        uppercase = new JLabel("To UpperCase");
        lowercase = new JLabel("To LowerCase");
        lowerUpper = new JLabel("To LowerUpperCase");
        number = new JLabel("Number of word");
        p_text = new JPanel(new GridLayout(5,2,10,20));
        p_text.add(string);
        p_text.add(stringText);
        p_text.add(uppercase);
        p_text.add(upperText);
        p_text.add(lowercase);
        p_text.add(lowerText);
        p_text.add(lowerUpper);
        p_text.add(LUText);
        p_text.add(number);
        p_text.add(numberText);

        main.add(p_text, gbc);

        p_button = new JPanel(new FlowLayout(FlowLayout.CENTER,100,0));
        ok = new JButton("OK");
        reset = new JButton("Reset");
        reset.addActionListener(this);
        exit = new JButton("Exit");
        exit.addActionListener(this);
        stringText.addActionListener(this);
        p_button.add(ok);
        p_button.add(reset);
        p_button.add(exit);


        gbc.gridy = 5;
        gbc.gridwidth = 1;
        gbc.weightx = 0.2;
        main.add(p_button, gbc);
        add(main);
        setSize(600,300);
        setVisible(true);
//        stringText.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                upperText.setText(stringText.getText());
//            }
//        });

        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stringText.setText("");
                upperText.setText("");
                lowerText.setText("");
                LUText.setText("");
                numberText.setText("");
            }
        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        stringText.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String uppertext = upper(stringText.getText());
                upperText.setText(uppertext);
                String lowertext = lower(stringText.getText());
                lowerText.setText(lowertext);
                String lowerupper = lowerUpper(stringText.getText());
                LUText.setText(lowerupper);
                int numberword = numberOfWord(stringText.getText());
                numberText.setText(Integer.toString(numberword));
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String uppertext = upper(stringText.getText());
                upperText.setText(uppertext);
                String lowertext = lower(stringText.getText());
                lowerText.setText(lowertext);
                String lowerupper = lowerUpper(stringText.getText());
                LUText.setText(lowerupper);
                int numberword = numberOfWord(stringText.getText());
                numberText.setText(Integer.toString(numberword));
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                String uppertext = upper(stringText.getText());
                upperText.setText(uppertext);
                String lowertext = lower(stringText.getText());
                lowerText.setText(lowertext);
                String lowerupper = lowerUpper(stringText.getText());
                LUText.setText(lowerupper);
                int numberword = numberOfWord(stringText.getText());
                numberText.setText(Integer.toString(numberword));
            }
        });
    }

    public int numberOfWord(String input) {
        int index = 0;
        boolean word = false;

        for(int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if(ch != ' ' && ch != '\n' && ch != '\t' && word == false) {
                index++;
                word = true;
            } else if (ch == ' ' || ch == '\t' || ch == '\n') {
                word = false;
            }
        }
        return index;
    }

//    public String upper(String input) {
//        String uppercase = input.toUpperCase();
//        return uppercase;
//    }

//    public String lower(String input) {
//        String lowercase = input.toLowerCase();
//        return lowercase;
//    }
public String upper(String input) {
    StringBuilder res = new StringBuilder();
    for(int i = 0; i < input.length(); i++) {
        char ch = input.charAt(i);
        if (ch >= 'a' && ch <= 'z') {
            ch = (char) (ch + 'A' - 'a');
            res.append(ch);
        } else {
            res.append(ch);
        }
    }
    return res.toString();
}

    public String lower(String input) {
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch - 'A' + 'a');
                res.append(ch);
            } else {
                res.append(ch);
            }
        }
        return res.toString();
    }


    public String lowerUpper(String input) {
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if(ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 'a' + 'A');
                res.append(ch);
            }else if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch - 'A' + 'a');
                res.append(ch);
            } else {
                res.append(ch);
            }
        }
        return  res.toString();
    }
    public bt9(){
        GUI();
    }




    public static void main(String[] args) {
        bt9 bt = new bt9();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
