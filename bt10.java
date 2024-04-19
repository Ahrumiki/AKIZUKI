//package org.example;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class bt10 extends JFrame implements ActionListener {
//    JTextField calcu = new JTextField();
//    JButton[] number = new JButton[10];
//    JButton add, sub, multi, div, equal, dot, reset;
//    JPanel main, p_text, p_button, p_num, p_equal;
//    public void GUi() {
////        p_button = new JPanel(new GridBagLayout());
//        main = new JPanel(new BorderLayout());
////        GridBagConstraints gbc = new GridBagConstraints();
////        gbc.gridx = 0;
////        gbc.gridy = 0;
////        gbc.weighty = 0;
////        gbc.weightx = 1.0;
////        gbc.fill = GridBagConstraints.HORIZONTAL;
////        gbc.insets = new Insets(10, 10, 10, 10); // Đặt khoảng cách padding
////        calculor.setPreferredSize(new Dimension(500, 80)); // Đặt kích thước cho text field
//
////        main.add(calculor,gbc);
//
////        GridBagConstraints gbc = new GridBagConstraints();
////        GridBagConstraints gbc1 = new GridBagConstraints();
////        gbc.fill = GridBagConstraints.BOTH;
////        gbc.weightx = 1.0;
////        gbc.weighty = 1.0;
////        // gbc.fill = GridBagConstraints.HORIZONTAL;
////        gbc.gridx = 0;
////        gbc.gridy = 0;
////        p_button.add(btn_7, gbc);
////
////        gbc.gridx = 1;
////        gbc.gridy = 0;
////        p_button.add(btn_8, gbc);
////
////        gbc.gridx = 2;
////        gbc.gridy = 0;
////        p_button.add(btn_9, gbc);
////
////        gbc.gridx = 3;
////        gbc.gridy = 0;
////        p_button.add(btn_div, gbc);
////
////        gbc1.gridx = 4;
////        gbc1.gridy = 0;
////        gbc1.gridheight = 4;
////        gbc1.fill = GridBagConstraints.VERTICAL;
////        p_button.add(btn_eq, gbc1);
////
////        gbc.gridheight = 1;
////        // gbc.fill = GridBagConstraints.HORIZONTAL;
////        gbc.gridx = 0;
////        gbc.gridy = 1;
////        p_button.add(btn_4, gbc);
////
////        gbc.gridx = 1;
////        gbc.gridy = 1;
////        p_button.add(btn_5, gbc);
////
////        gbc.gridx = 2;
////        gbc.gridy = 1;
////        p_button.add(btn_6, gbc);
////
////        gbc.gridx = 3;
////        gbc.gridy = 1;
////        p_button.add(btn_mul, gbc);
////
////        // gbc.fill = GridBagConstraints.HORIZONTAL;
////        gbc.gridx = 0;
////        gbc.gridy = 2;
////        p_button.add(btn_1, gbc);
////
////        gbc.gridx = 1;
////        gbc.gridy = 2;
////        p_button.add(btn_2, gbc);
////
////        gbc.gridx = 2;
////        gbc.gridy = 2;
////        p_button.add(btn_3, gbc);
////
////        gbc.gridx = 3;
////        gbc.gridy = 2;
////        p_button.add(btn_sub, gbc);
////
////        // gbc.fill = GridBagConstraints.HORIZONTAL;
////        gbc.gridx = 0;
////        gbc.gridy = 3;
////        p_button.add(btn_0, gbc);
////
////        gbc.gridx = 1;
////        gbc.gridy = 3;
////        p_button.add(btn_dot, gbc);
////
////        gbc.gridx = 2;
////        gbc.gridy = 3;
////        p_button.add(btn_clear, gbc);
////
////        gbc.gridx = 3;
////        gbc.gridy = 3;
////        p_button.add(btn_add, gbc);
//        calcu.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
//        calcu.setHorizontalAlignment(SwingConstants.RIGHT);
//        p_text = new JPanel(new BorderLayout(2,2));
//        p_text.add(calcu, BorderLayout.CENTER);
//
//        for(int i = 0; i < 10; i++) {
//            number[i] = new JButton(Integer.toString(i));
//            number[i].addActionListener(this);
//        }
//        add = new JButton("+");
//        add.addActionListener(this);
//        sub = new JButton("-");
//        sub.addActionListener(this);
//        multi = new JButton("x");
//        multi.addActionListener(this);
//        div = new JButton("/");
//        div.addActionListener(this);
//        equal = new JButton("=");
//        equal.addActionListener(this);
//        dot = new JButton(".");
//        dot.addActionListener(this);
//        reset = new JButton("C");
//        reset.addActionListener(this);
//
//        p_button = new JPanel(new GridBagLayout());
//
//        GridBagConstraints gbc = new GridBagConstraints();
//        gbc.gridx = 0;
//        gbc.gridy = 0;
//        gbc.weighty = 0;
//        gbc.weightx = 1.0;
//        gbc.insets = new Insets(2,2,2,2);
//
//        p_num = new JPanel(new GridLayout(4,4));
//        p_num.add(number[7]);
//        p_num.add(number[8]);
//        p_num.add(number[9]);
//        p_num.add(div);
//        p_num.add(number[4]);
//        p_num.add(number[5]);
//        p_num.add(number[6]);
//        p_num.add(multi);
//        p_num.add(number[1]);
//        p_num.add(number[2]);
//        p_num.add(number[3]);
//        p_num.add(sub);
//        p_num.add(number[0]);
//        p_num.add(dot);
//        p_num.add(reset);
//        p_num.add(add);
//
//        p_equal = new JPanel(new GridBagLayout());
//        p_equal.add(equal, gbc);
//
//        gbc.fill = GridBagConstraints.BOTH;
//        gbc.gridx = 0;
//        gbc.gridy = 0;
//        gbc.gridwidth = 1;
//        gbc.gridheight = 4;
//        gbc.insets = new Insets(2,	0,	2,	0);
//        p_button.add(p_num, gbc);
//
//        gbc.gridx = 4;
//        gbc.gridy = 0;
//        gbc.gridheight = 4;
////        gbc.fill = GridBagConstraints.VERTICAL;
//        p_button.add(equal, gbc);
//
////        gbc.gridx=4;
////        gbc.gridy=0;
////        gbc.gridwidth = 1;
////        gbc.gridheight = 4;
//////        gbc.weighty  = 1;
////        p_button.add(equal, gbc);
//
//        gbc.gridx = 0;
//        gbc.gridy = 0;
//        gbc.gridwidth = 0;
//        gbc.gridheight = 1;
//        main.add(p_text, BorderLayout.NORTH);
//
//        gbc.gridx = 0;
//        gbc.gridy = 1;
//        gbc.weighty = 1;
//        gbc.weightx = 4;
//        main.add(p_button, BorderLayout.CENTER);
//
//        add(main);
//        setSize(500,200);
//        setVisible(true);
//
//    }
//    @Override
//    public void actionPerformed(ActionEvent e) {
//
//    }
//
//    public bt10(){
//        GUi();
//    }
//
//    public static void main(String[] args) {
//        bt10 bt = new bt10();
//    }
//}

package org.example;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class bt10 extends JFrame implements ActionListener {
    JTextField txInput;

    JPanel pn_main,pn_tx,pn_btn,pn_left,pn_right;
    JButton[] number = new JButton[10];

    JButton add, sub, multi, div, equal, reset, dot;




    public void GUI()
    {
        txInput = new JTextField("");
        txInput.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        txInput.setHorizontalAlignment(SwingConstants.RIGHT);
        txInput.setEditable(false);
        pn_tx = new JPanel(new BorderLayout());
        pn_tx.add(txInput,BorderLayout.CENTER);

        for(int i = 0; i < 10; i++) {
            number[i] = new JButton(Integer.toString(i));
            number[i].addActionListener(this);
        }
        add = new JButton("+");
        add.addActionListener(this);
        sub = new JButton("-");
        sub.addActionListener(this);
        multi = new JButton("x");
        multi.addActionListener(this);
        div = new JButton("/");
        div.addActionListener(this);
        reset = new JButton("C");
        reset.addActionListener(this);
        dot = new JButton(".");
        dot.addActionListener(this);
        equal = new JButton("=");
        equal.addActionListener(this);
//        btn_7 = new JButton("7");
//        btn_7.addActionListener(this);
//        btn_8 = new JButton("8");
//        btn_8.addActionListener(this);
//        btn_9 = new JButton("9");
//        btn_9.addActionListener(this);
//        btn_div = new JButton("/");
//        btn_div.addActionListener(this);
//        btn_4 = new JButton("4");
//        btn_4.addActionListener(this);
//        btn_5 = new JButton("5");
//        btn_5.addActionListener(this);
//        btn_6 = new JButton("6");
//        btn_6.addActionListener(this);
//        btn_mul = new JButton("*");
//        btn_mul.addActionListener(this);
//        btn_1 = new JButton("1");
//        btn_1.addActionListener(this);
//        btn_2 = new JButton("2");
//        btn_2.addActionListener(this);
//        btn_3 = new JButton("3");
//        btn_3.addActionListener(this);
//        btn_sub = new JButton("-");
//        btn_sub.addActionListener(this);
//        btn_0 = new JButton("0");
//        btn_0.addActionListener(this);
//        btn_dot = new JButton(".");
//        btn_dot.addActionListener(this);
//        btn_C = new JButton("C");
//        btn_C.addActionListener(this);
//        btn_add = new JButton("+");
//        btn_add.addActionListener(this);
//        btn_equal = new JButton("=");
//        btn_equal.addActionListener(this);


        pn_btn=	new JPanel();
        pn_btn.setLayout(new GridBagLayout());


        GridBagConstraints	gbc	=	new GridBagConstraints();
        gbc.anchor =	GridBagConstraints.PAGE_START;
        gbc.fill =	GridBagConstraints.BOTH;
        gbc.weightx =	1.0;
        gbc.weighty =	1.0;
        gbc.insets =	new Insets(2,	2,	2,	2);

        pn_left= new JPanel(new GridLayout(4,4));
        pn_left.add(number[7]);
        pn_left.add(number[8]);
        pn_left.add(number[9]);
        pn_left.add(div);
        pn_left.add(number[4]);
        pn_left.add(number[5]);
        pn_left.add(number[6]);
        pn_left.add(multi);
        pn_left.add(number[1]);
        pn_left.add(number[2]);
        pn_left.add(number[3]);
        pn_left.add(sub);
        pn_left.add(number[0]);
        pn_left.add(dot);
        pn_left.add(reset);
        pn_left.add(add);


        pn_right = new JPanel(new GridBagLayout());
        gbc.gridx=0;
        gbc.gridy=0;
        pn_right.add(equal,gbc);

        gbc.gridx=0;
        gbc.gridy=0;
        gbc.gridwidth=4;
        gbc.gridheight=4;
        gbc.insets =	new Insets(2,	0,	2,	0);
        pn_btn.add(pn_left,gbc);

        gbc.gridx=4;
        gbc.gridy=0;
        gbc.gridwidth=4;
        gbc.gridheight=4;

        pn_btn.add(pn_right,gbc);

        pn_main = new JPanel(new GridBagLayout());
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        pn_main.add(pn_tx, gbc);


        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 4;
        pn_main.add(pn_btn, gbc);
        add(pn_main);
        setSize(300,200);
        setVisible(true);
    }


    public double calculate(String s) {
        int len;
        if(s==null || (len = s.length())==0) return 0;
        Stack<Double> stack = new Stack<Double>();
        double num = 0.0;
        char sign='+' ;
        boolean fra=false;
        double f=0.1;
        for(int i=0;i<len;i++){
            if(Character.isDigit(s.charAt(i))||s.charAt(i)=='.'){
                if(s.charAt(i)=='.')
                {
                    fra=true;
                    continue;
                }
                if(!fra)
                    num = num*10+s.charAt(i)-'0';
                else
                {
                    num = num + f*(s.charAt(i)-'0');
                    f=f/10;
                }
            }



            if((!Character.isDigit(s.charAt(i)) &&' '!=s.charAt(i)) || i==len-1){
                fra=false;
                f=0.1;
                if(sign=='-'){
                    stack.push(-num);
                }
                if(sign=='+'){
                    stack.push(num);
                }
                if(sign=='*'){
                    stack.push(stack.pop()*num);
                }
                if(sign=='/'){
                    stack.push(stack.pop()/num);
                }
                sign = s.charAt(i);
                num = 0;

            }
        }

        double re = 0;
        for(double i:stack){
            re += i;
        }
        return re;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        String command = e.getActionCommand();
//        switch (command) {
//            case "0":
//                txInput.setText(txInput.getText()+"0");
//                break;
//            case "1":
//                txInput.setText(txInput.getText()+"1");
//                break;
//            case "2":
//                txInput.setText(txInput.getText()+"2");
//                break;
//            case "3":
//                txInput.setText(txInput.getText()+"3");
//                break;
//            case "4":
//                txInput.setText(txInput.getText()+"4");
//                break;
//            case "5":
//                txInput.setText(txInput.getText()+"5");
//                break;
//            case "6":
//                txInput.setText(txInput.getText()+"6");
//                break;
//            case "7":
//                txInput.setText(txInput.getText()+"7");
//                break;
//            case "8":
//                txInput.setText(txInput.getText()+"8");
//                break;
//            case "9":
//                txInput.setText(txInput.getText()+"9");
//                break;
//            case "+":
//                txInput.setText(txInput.getText()+"+");
//                break;
//            case "-":
//                txInput.setText(txInput.getText()+"-");
//                break;
//            case "*":
//                txInput.setText(txInput.getText()+"*");
//                break;
//            case "/":
//                txInput.setText(txInput.getText()+"/");
//                break;
//            case ".":
//                txInput.setText(txInput.getText()+".");
//                break;
//            case "C":
//
//                txInput.setText("");
//                break;
//
//            case "=":
//                txInput.setText(""+calculate(txInput.getText()));
//                break;
//        }
        for(int i = 0; i < 10; i++) {
            if(e.getSource() == number[i]) {
                txInput.setText(txInput.getText() + number[i].getText());
            }
        }
        if(e.getSource() == add) {
            txInput.setText(txInput.getText() + "+");
        }
        if(e.getSource() == sub) {
            txInput.setText(txInput.getText() + "-");
        }
        if(e.getSource() == multi) {
            txInput.setText(txInput.getText() + "x");
        }
        if(e.getSource() == div) {
            txInput.setText(txInput.getText() + "/");
        }
        if(e.getSource() == dot) {
            txInput.setText(txInput.getText() + ".");
        }
        if(e.getSource() == reset) {
            txInput.setText("");
        }
        if(e.getSource() == equal) {
            double res = calculate(txInput.getText());
            txInput.setText(Double.toString(res));
        }


    }
    public bt10() {
        GUI();
    }
    public static void main(String[] args) {

        new bt10();
    }



}

