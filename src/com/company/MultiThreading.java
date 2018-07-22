package com.company;

import jdk.nashorn.internal.ir.annotations.Ignore;
import java.util.Random;

@Ignore
class MultiThreading implements Runnable {

    int time;
    String name;
    Random r = new Random();

    public MultiThreading(String name){
        this.name = name;
        time = r.nextInt(999);
    }

    @Override
    public void run() {
        System.out.printf("Поток %s спит %d ms \n", name, time);

        try{
            Thread.sleep(time);
        } catch(Exception e){}

            System.out.printf("Поток %s проснулся и закончился \n", name);
    }
}
