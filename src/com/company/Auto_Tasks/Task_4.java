package com.company.Auto_Tasks;

import jdk.nashorn.internal.ir.annotations.Ignore;

import java.util.Arrays;

@Ignore
public class Task_4 {

    public static void main (String[] args) {

        int[] bubbleArray = {5, 4, 7, 9, 1, 3, 4, 2};

        boolean swap = true;
        while(swap){
            swap = false;
            for (int i = 1; i < bubbleArray.length; i++){
                if(bubbleArray[i - 1] > bubbleArray[i]){
                    int temp = bubbleArray[i - 1];
                    bubbleArray[i - 1] = bubbleArray[i];
                    bubbleArray[i] = temp;
                    swap = true;
                }
            }
        }
//        int length = bubbleArray.length;
//
//        for(int i = 0; i < length; i++){
//            for (int n = 1; n < length - i; n++){
//                if (bubbleArray[n - 1] > bubbleArray[n]) {
//                    int temp = bubbleArray[n - 1];
//                    bubbleArray[n - 1] = bubbleArray[n];
//                    bubbleArray[n] = temp;
//                }
//            }
//        }
        System.out.println(Arrays.toString(bubbleArray));
    }
}
