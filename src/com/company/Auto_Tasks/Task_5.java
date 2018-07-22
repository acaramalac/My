package com.company.Auto_Tasks;

import jdk.nashorn.internal.ir.annotations.Ignore;

@Ignore
public class Task_5 {

    public static void main (String[] args) {

        int[] arrayOfInt = {3, 6, 17, 45, 34, 12, 9, 28, 5};
        int sumOfOdd = 0;
        int evenAmmount = 0;

        for (int i = 0; i < arrayOfInt.length - 1; i++) {
            if ( (arrayOfInt[i] & 1) == 0 ) {
                sumOfOdd = sumOfOdd + arrayOfInt[i];
            } else {
                evenAmmount = evenAmmount + 1;
            }
        }
        System.out.println("The sum of odd numbers is: " + sumOfOdd);
        System.out.println("The amount of even number is: " + evenAmmount);
    }
}
