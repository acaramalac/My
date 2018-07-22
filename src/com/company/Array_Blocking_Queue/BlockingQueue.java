package com.company.Array_Blocking_Queue;

import jdk.nashorn.internal.ir.annotations.Ignore;

import java.util.concurrent.ArrayBlockingQueue;

@Ignore
public class BlockingQueue {

    private static ArrayBlockingQueue<Object> list = new ArrayBlockingQueue<Object>(1000);

    public static void main(String args[]){

        addObjects();
        proceed();
    }

    private static void proceed(){

        System.out.println(list.size());

        for(Object element: list){
            list.remove(element);
        }
        System.out.println(list.size());
    }

    private static void addObjects() {

        for(int i = 0; i < 5; i++) {
            list.add(new Object());
        }
    }
}
