package com.company.Synchronized_Code_block;

import jdk.nashorn.internal.ir.annotations.Ignore;

@Ignore
public class Main2 {

    public static void main(String args[]) {
        Worker2 worker = new Worker2();
        worker.start();
    }
}
