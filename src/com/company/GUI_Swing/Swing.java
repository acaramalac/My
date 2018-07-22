package com.company.GUI_Swing;

import javax.swing.*;
import java.awt.*;

public class Swing {

    public static void main(String[] args){

        Okno okno = new Okno();
        JScrollPane scrPane = new JScrollPane();
        okno.setVisible(true);
        okno.setLayout(null);
        okno.add(scrPane);
        scrPane.setBounds(100,100,100,100);

    }
}
