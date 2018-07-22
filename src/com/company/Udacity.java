
package com.company;

import jdk.nashorn.internal.ir.annotations.Ignore;
@Ignore

public class Udacity {

    /* public int monopolyDice(int sides){
            double diceRoll = Math.random();
            diceRoll = diceRoll * sides;
            diceRoll = diceRoll + 1;
            diceRoll = (int) diceRoll;
            return diceRoll; // return (int) diceRoll
        }

        public int monopolyRoll() {
            int roll1 = monopolyDice(6);
            int roll2 = monopolyDice(6);
            int total = roll1 + roll2;
            int rollSoFar = 1;

            while (roll1 == roll2) {
                if (rollSoFar >=3) return -1;
                roll1 = diceRoll(6);
                roll2 = diceRoll(6);
                total = total + roll1 + roll2;
                rollSoFar = rollSoFar + 1;
            }
            return total;
        }   */

    /* public int findRange(int[] intArray) {
        int longestNumber = 0;
        int shortestNumber = 0;
        int dif = 0;
        if (intArray.length == 0){
            return -1;
        } else {
            for (int i = 0; i < intArray.length; i++) {
                if (intArray[i] < shortestNumber) {
                    shortestNumber = intArray[i];
                } else if (intArray[i] > longestNumber) {
                    longestNumber = intArray[i];
                }
            }
            dif = longestNumber - shortestNumber;
            return dif;
        }
    } */

    /* public void printInReverse(String [] stringArray) {
        stringArray = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int lengthOfArray = stringArray.length;
        // String lengthArray = stringArray[0];
        for (int i = 0; i < lengthOfArray; i++) {
            int indexToPrint = lengthOfArray - 1 - i;
            System.out.println(stringArray[indexToPrint]);
        }
    } */

    /* public int yearsTillOneMillion(double initialBalance) {
        double Million = 1000000;
        int i;
        for (i = 1; initialBalance < Million; i++) {
            initialBalance += (initialBalance *= 0.05);
        }
        return i;
        System.out.println("Years before one million: " + yearsTillOneMillion());
    }

    public int yearsTillOneMillion(double initialBalance) {
        int years = 0;
        double balance = initialBalance;
        while (balance < 1000000) {
            years++;
            balance = balance * 1.05;
        }
        return years;
    } */

    /* public int indexOfFirstOccurence(String [] stringArray, String target) {
        for (int i = 0; i < stringArray.length; i++){
            if (stringArray[i].equals(target)){
                return i;
            }
        }
        return -1;
    } */

    /* public int factorial(int n) {
        int product = 1;
        for (int i = 1; i <= n; i++){
            product *= i;
        }
        return product;
    } */

    /* public String findLongestName(String [] names){
        int size
        int longestName = names.length;
        String longestName = names[0];

        for (int i = 1; i < size; i++) {
            if (names[i].length() > longestName.length()){
                longestName = names[i];
            }
        }
        return longestName;
    } */

    /* public double calculateAverage(double [] temperatures ) {
        temperatures = {75,73,72,80};
        int size = temperatures.length;
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += temperatures[i];
        }
        double average = total/size;
        return average;
    } */

    /* int [] numbers = {12,1,177,3,4,0,0,121,1,-4,0,-100,2};
        System.out.println("Your number is: " + numbers[0]); */

    /*
    public int martingale(){
        int money = 1000;
        int target = 1200;
        int bet = 10;
        while(money>bet) {
            boolean win = play();
            if(win) {
                money += bet;
                bet = 10;
            } else {
                money -= bet;
                bet *= 2;
            }
        }
        return money;
    } */

    /*
public void searchWiFi(){
    for (int i = 1; i <= 10; i++) {
        boolean wifiAvailable = checkWiFi();
        if(wifiAvailable) {
            System.out.println("WiFi found");
            break;
        }
    }
} */

    /* public int countBlocks(int levels){    // calculating number of pyramid's blocks
        int total = 0;

        for(int i = 1; i <= levels; i++) {

            total = total + (i*i);
        }
        return total;
    } */

    /* public void raiseAlarm (int numOfWarnings){

        for(int i = 1; i <= 3; i++){  //infinite loop
            i = i - 1;
            System.out.println(i);
        }
    } */


    /* public void raiseAlarm (int numOfWarnings){

        for(int i = 1; i <= numOfWarnings; i++){
            System.out.println("Warning # " + i);
        }
    } */

    /* public void raiseAlarm (int numOfWarnings){

        int i = 1; //loop counter

        while (i<= numOfWarnings) {
            System.out.println("Warning!");
            i++; // i = i + 1
        }
    } */

    /* public int keeprolling() {
        int dice1 = rollDice();
        int dice2 = rollDice();
        int dice3 = rollDice();
        int dice4 = rollDice();
        int dice5 = rollDice();
        int count = 1;
        while(!(dice1 == dice2 && dice2 == dice3 && dice3 == dice4 && dice4 == dice5)) {
            //we need to re-roll
            dice1 = rollDice();
            dice2 = rollDice();
            dice3 = rollDice();
            dice4 = rollDice();
            dice5 = rollDice();
            count = count +1;
        }
        return count;
    } */

    /* String googol = "1";
    int len = googol.length();
    while(len < 101) {
        googol = googol + "0";
        len = googol.length();
    } */


    /* public void alarm() {
        boolean on = checkAlarm();

        while(on){
            beep();
            on = checkAlarm();
        }

    } */
}
