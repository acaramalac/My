package com.company.Constructor;

import jdk.nashorn.internal.ir.annotations.Ignore;

@Ignore
public class Birds {

    private String name;
    private boolean canFly;


    public Birds(String name, boolean canFly){
        System.out.print("Я птичка ");
        this.name = name;
        this.canFly = canFly;
    }

    public String getName() {
        return name;
    }

    public boolean isCanFly() {
        return canFly;
    }

}
