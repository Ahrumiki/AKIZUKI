package org.example;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class bt11 extends JFrame implements ActionListener {
    JPanel main = new JPanel(new FlowLayout());
    JTextField text = new JTextField(13);
    JButton ok = new JButton("OK");
    JLabel label = new JLabel("The event is displayed here");
    DefaultListModel<String> list = new DefaultListModel<>();
    JList<String> lists = new JList<>(list);
    JScrollPane scr = new JScrollPane(lists);


    public void GUI() {
        ok.addActionListener(this);
        list.addElement("Duck");
        list.addElement("Viet");
        list.addElement("Hoang");
        list.addElement("Nghia");
        scr.setPreferredSize(new Dimension(100,60));
        text.addActionListener(this);
        main.add(ok);
        main.add(text);
        main.add(scr);

        main.add(label);
        add(main);
        setSize(350,300);
        setVisible(true);
        lists.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String selected = lists.getSelectedValue();
                label.setText(selected + " is selected");
            }
        });
        text.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(text.getText().length() > 0) {
                    label.setText("The key " + text.getText().charAt(text.getText().length() - 1) + " is presses");
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if(text.getText().length() > 0) {
                    label.setText("The key " + text.getText().charAt(text.getText().length() - 1) + " is removed");
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == ok) {
            label.setText("The ok button is presses");
        }
        if(e.getSource() == text) {
            label.setText("The text is " + text.getText());
        }

    }



    public bt11(){
        GUI();
    }
    public static void main(String[] args) {
        bt11 bt = new bt11();
    }
}
