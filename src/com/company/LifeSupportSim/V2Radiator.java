package com.company.LifeSupportSim;

import jdk.nashorn.internal.ir.annotations.Ignore;

import java.util.ArrayList;

@Ignore
public class V2Radiator {

    V2Radiator(ArrayList list) {
        for (int x = 0; x < 5; x++) {
            list.add(new SimUnit("V2Radiator"));
        }
    }
}
