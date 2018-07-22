package com.company.LifeSupportSim;

import jdk.nashorn.internal.ir.annotations.Ignore;

import java.util.ArrayList;

@Ignore
public class V3Radiator extends V2Radiator{
    V3Radiator(ArrayList lglist) {
        super(lglist);
        for(int g = 0; g < 10; g++){
            lglist.add(new SimUnit("V3Radiator"));
        }
    }

}
