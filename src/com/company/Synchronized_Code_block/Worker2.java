package com.company.Synchronized_Code_block;

import jdk.nashorn.internal.ir.annotations.Ignore;

import java.util.ArrayList;
import java.util.Random;

@Ignore
public class Worker2 {

    private ArrayList<Integer> list1 = new ArrayList<Integer>();
    private ArrayList<Integer> list2 = new ArrayList<Integer>();

    private Object lock1 = new Object();
    private Object lock2 = new Object();

    private Random random = new Random();

    private void partOne(){
        synchronized (lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list1.add(random.nextInt(100));
        }
    }

    private void partTwo(){
        synchronized (lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list2.add(random.nextInt(100));
        }
    }

    private void proceed(){
        for(int i = 0; i < 1000; i++){
            partOne();
            partTwo();
        }
    }

    public void start(){
        System.out.println("Let's begin!");
        long starTime = System.currentTimeMillis();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                proceed();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                proceed();
            }
        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Time spent: " + (endTime-starTime) + "\n"
                + "list1: " + list1.size() + "\n"
                + "list2: " + list2.size());
    }
}
