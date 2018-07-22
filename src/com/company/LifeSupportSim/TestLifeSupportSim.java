package com.company.LifeSupportSim;

import jdk.nashorn.internal.ir.annotations.Ignore;

import java.util.ArrayList;
@Ignore
public class TestLifeSupportSim {
    public static void main(String[] args){
        ArrayList aList = new ArrayList();
        V2Radiator v2 = new V2Radiator(aList);
        V3Radiator v3 = new V3Radiator(aList);

        for(int z = 0; z < 20; z++){
            RetentionBot ret = new RetentionBot(aList);
        }
        for(int k = 0; k < aList.size(); k++){
            System.out.println("Element: " + aList);
        }
    }
}
