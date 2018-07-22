package com.company.LifeSupportSim;

import jdk.nashorn.internal.ir.annotations.Ignore;

@Ignore
public class SimUnit {
    String botType;
    SimUnit(String type) {
        botType = type;
    }
    int powerUse(){
        if("Retention".equals(botType)){
            return 2;
        } else {
            return 4;
        }
    }
}
