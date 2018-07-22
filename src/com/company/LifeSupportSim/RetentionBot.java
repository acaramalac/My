package com.company.LifeSupportSim;

import jdk.nashorn.internal.ir.annotations.Ignore;

import java.util.ArrayList;

@Ignore
public class RetentionBot {
    RetentionBot(ArrayList rlist){
        rlist.add(new SimUnit("Retention"));
    }
}
