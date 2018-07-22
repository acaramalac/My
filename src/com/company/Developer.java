package com.company;

import jdk.nashorn.internal.ir.annotations.Ignore;
@Ignore

public class Developer extends Person {

    public Developer(String firstName, String lastName, int id) {

        super(firstName, lastName, id);
    }

    public void develop(String task) {

        System.out.println("I'm doing the task: " + task + " now!");
    }

    @Override
    protected void changeId() {
        int devId = getId() + 2;
    }
}
