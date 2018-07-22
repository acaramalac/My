package com.company;

import jdk.nashorn.internal.ir.annotations.Ignore;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
@Ignore
public class ReaderGUI extends JFrame{

    JButton b1, b2;
    JLabel l1, l2, l3, l4;
    JTextField t1, t2;
    int i, k;
    String a, b;
    eHandler handler = new eHandler();

    public ReaderGUI(String s) {

        super(s);
        setLayout(new FlowLayout());

        b1 = new JButton("Clear");
        b2 = new JButton("Count");

        l1 = new JLabel("Insert first number:");
        l2 = new JLabel("Insert second number:");
        l3 = new JLabel("");
        l4 = new JLabel("");

        t1 = new JTextField(10);
        t2 = new JTextField(10);

        add(t1);
        add(l1);
        add(t2);
        add(l2);
        add(l3);
        add(l4);
        add(b2);
        add(b1);
        b1.addActionListener(handler);
        b2.addActionListener(handler);
    }
@Ignore
    public class eHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource() == b2) {
                    i = Integer.parseInt(t1.getText());
                    k = Integer.parseInt(t2.getText());
                    i++;
                    k++;
                    a = "Ваше первое число теперь равно " + i;
                    b = "Ваше второе число теперь равно " + k;
                    l3.setText(a);
                    l4.setText(b);
                }

                if (e.getSource() == b1) {
                    t1.setText(null);
                    t2.setText(null);
                    l3.setText("");
                    l4.setText("");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Введите в поле число");
            }
        }
    }

}
