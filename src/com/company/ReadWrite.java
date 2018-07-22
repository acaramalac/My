package com.company;

import jdk.nashorn.internal.ir.annotations.Ignore;

import javax.swing.*;
import java.io.File;
import java.util.Scanner;

@Ignore
public class ReadWrite {

        static String[][] m = new String[5][3];
        static Scanner scn;


    public static void openfile() {
        try {
            scn = new Scanner(new File("res//1.txt"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "File not found.");
        }
    }
        public static void readfile() {
            while (scn.hasNext()) {
                for (int row = 0; row < m.length; row++) {
                    for (int col = 0; col < m[row].length; col++) {
                        m[row][col] = scn.next();
                    }
                }
            }

        }

        public static void out() {
                for (int row = 0; row < m.length; row++) {
                    for (int col = 0; col < m[row].length; col++) {
                        System.out.print(m[row][col] + "   ");
                    }
                    System.out.println();
                }
            }
        }
