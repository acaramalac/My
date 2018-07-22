package com.company.Synchronized;

import jdk.nashorn.internal.ir.annotations.Ignore;

@Ignore
public class Worker implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i < 2000; i++) {
            SynchronizedThreads.increaseNumber();
        }
    }
}
