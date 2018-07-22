package com.company.Collections;

import jdk.nashorn.internal.ir.annotations.Ignore;

import java.util.ArrayList;
import java.util.Random;
@Ignore
public class Collections {

    private static ArrayList<Mobile> mobiles = new ArrayList<Mobile>();
    private static Random r = new Random();

    public static void main(String[] args) {

        for(int i = 0; i < 300; i++){
            mobiles.add(new Mobile(r.nextInt(999999), "bombom"));
        }
        for(Mobile m: mobiles){
            System.out.println(m.getNumber() + " " + m.getName());
        }
    }
}
