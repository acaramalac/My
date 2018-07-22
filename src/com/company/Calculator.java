package com.company;

import jdk.nashorn.internal.ir.annotations.Ignore;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
@Ignore
public class Calculator extends JFrame {

    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18;
    JLabel l1, l2, l3;
    JTextField t1;
    int a, b;
    int f;
    String textInput, textTemp;
    eHandler handler = new eHandler();

    public Calculator(String s) {

        super(s);
        setLayout(new FlowLayout());

        b10 = new JButton("C");
        b11 = new JButton("<");
        b12 = new JButton("+");
        b12 = new JButton("-");
        b13 = new JButton("*");
        b14 = new JButton("/");
        b15 = new JButton("=");
        b16 = new JButton("-+");
        b17 = new JButton(".");
        b1 = new JButton("7");
        b2 = new JButton("8");
        b3 = new JButton("9");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("1");
        b8 = new JButton("2");
        b9 = new JButton("3");
        b18 = new JButton("0");
        t1 = new JTextField(10);
        t1.setEditable(false);
        //t1.setText("");

        add(b10);
        add(b11);
        add(b16);
        add(t1);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b17);
        add(b12);
        add(b13);
        add(b14);
        add(b15);

        b1.addActionListener(handler);
        b2.addActionListener(handler);
        b3.addActionListener(handler);
        b4.addActionListener(handler);
        b5.addActionListener(handler);
        b6.addActionListener(handler);
        b7.addActionListener(handler);
        b8.addActionListener(handler);
        b9.addActionListener(handler);
        b10.addActionListener(handler);
        b11.addActionListener(handler);
        b12.addActionListener(handler);
        b13.addActionListener(handler);
        b14.addActionListener(handler);
        b15.addActionListener(handler);
        b16.addActionListener(handler);
        b17.addActionListener(handler);

    }
@Ignore
    public class eHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            for (f = 0; f < 10; f++) {
            if (e.getSource() == b18 || e.getSource() == b1 || e.getSource() == b2 || e.getSource() == b3 || e.getSource() == b4 || e.getSource() == b5 || e.getSource() == b6 || e.getSource() == b7 || e.getSource() == b8 || e.getSource() == b9) {
                t1.setText(textInput + textTemp);
                //textInput = textInput + textTemp;

                }
            }
        }
    }
}
