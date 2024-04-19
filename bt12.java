package org.example;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class bt12 extends JFrame implements ActionListener {
    JPanel main = new JPanel(new FlowLayout());
    JCheckBox male = new JCheckBox("Male");
    JCheckBox femael = new JCheckBox("Female");
    JLabel label = new JLabel("The event is displayed here");
    DefaultListModel<String> list = new DefaultListModel<>();

    JScrollPane scr;
    Choice choice = new Choice();

    public void GUI(){
        choice.addItem("omae");
        choice.addItem("kisama");
        choice.addItem("kuso");
        male.addActionListener(this);
        femael.addActionListener(this);
        list.addElement("Toan");
        list.addElement("Mono");
        list.addElement("Duy");
        list.addElement("Hieu");
        JList<String> lists = new JList<>(list);
        scr = new JScrollPane(lists);
        scr.setPreferredSize(new Dimension(100,60));

        male.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED) {
                    femael.setSelected(false);
                    label.setText("Male is selected");
                } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                    label.setText("Male is deselected");
                }
            }
        });
        femael.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED) {
                    male.setSelected(false);
                    label.setText("Female is selected");
                } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                    label.setText("Female is deselected");
                }
            }
        });

        choice.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED) {
                    label.setText(choice.getSelectedItem() + " is selected");
                }
            }
        });

        lists.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                label.setText(lists.getSelectedValue() + " is selected");
            }
        });
        main.add(male);
        main.add(femael);
        main.add(choice);
        main.add(scr);
        main.add(label);

        add(main);
        setSize(350,200);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
//        if(e.getSource() == male) {
//            label.setText("Male is ticked");
//        } else if (e.getSource() == femael) {
//            label.setText("Fe");
//        }
    }


    public bt12(){
        GUI();
    }

    public static void main(String[] args) {
        bt12 bt = new bt12();
    }
}
