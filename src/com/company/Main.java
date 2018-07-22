package com.company;

import HeadFirstJava.Duck;
import jdk.nashorn.internal.ir.annotations.Ignore;
import javax.swing.*;
@Ignore
public class Main {

    public static void main(String[] args) {

        /**
        Thread t1 = new Thread(new MultiThreading("1"));
        Thread t2 = new Thread(new MultiThreading("2"));
        Thread t3 = new Thread(new MultiThreading("3"));
        t1.start();
        t2.start();
        t3.start();
        */

        /**
        ReadWrite r = new ReadWrite();
        r.openfile();
        r.readfile();
        r.out();
        */

    /**
        Calculator c = new Calculator("G-gurda");
        c.setVisible(true);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setSize(260,300);
        c.setResizable(false);
        c.setLocationRelativeTo(null);
        */

        /** int[] m = new int[5];

        for(int x = 0; x < 5; x++) {
            m[x] = -x;
            System.out.println(m[x]);
        } */


        /** int x = 99;
        String b = "precious meow";
        String bs = "precious meows";
        String w = " on the wall";
        String t ="Take one down and pass it around, ";
        while(x>=1) {
            if (x == 1) {
                System.out.println(x + " " + b + w + ", " + x + " " + b + ".");
                x = x - 1;
                System.out.println(t + "no more " + bs + w + ".");
            } else {
                if (x == 2) {
                    System.out.println(x + " " + bs + w + ", " + x + " " + bs + ".");
                    x = x - 1;
                    System.out.println(t + x + " " + b + w + ".");
                    System.out.println("");
                } else {
                    System.out.println(x + " " + bs + w + ", " + x + " " + bs + ".");
                    x = x - 1;
                    System.out.println(t + x + " " + bs + w + ".");
                    System.out.println("");
                }
            }
        } */

        /** Reader r = new Reader();
        r.Scan();
        r.i = count(r.i);
        r.k = count(r.k);

        r.Scan(r.i, r.k);

    }
        private static int count(int x) {
            x = x + 1;
            return x;
        }
        */

        /**
            for (int x = 0; x < 4; x++) {

                for (int y = 4; y > 2; y--) {

                    System.out.println(x + " " + y);
                }
                if (x == 1) {
                    x++;
                    }
                }
        */



        /** int x = 0;

        while (x < 4) {

            System.out.print("a");

            if (x < 1 ) {
                System.out.print(" ")
         ;
            }
            System.out.print("n");

            if (x > 1) {
                System.out.print(" oyster");
                x = x + 2;
            }

            if (x == 1) {
                System.out.print("noys");
            }

            if (x < 1) {
                System.out.print("oise");
            }
                System.out.println("");
            x = x + 1;
        }
         */

        /** String [] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "B-to-B",
                "win-win", "front-end", "web-based", "pervasive", "smart",
                "six-sigma", "critical-path", "dynamic"};

        String [] wordListTwo = {"empowered", "sticky", "value-added", "oriented",
                "centric", "distributed", "clustered", "branded", "outside-the-box",
                "positioned", "networked", "focused", "leveraged", "aligned",
                "targeted", "shared", "cooperative", "accelerated"};
        String [] wordListThree = {"process", "tipping-point", "solution", "architecture",
                "core competency", "strategy", "mindshare", "portal", "space",
                "vision", "paradigm", "mission"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("What we need is a " + phrase);
        */


        /** int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0) {

            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beerNum = beerNum - 1;

            if (beerNum > 1) {
                System.out.println(beerNum + " " + word + " of beer on the wall");
                System.out.println("");
            } else if (beerNum == 1) {
                word = "bottle";
                System.out.println(beerNum + " " + word + " of beer on the wall");
                System.out.println("");
            } else {
                System.out.println("No more bottles of beer on the wall.");
                System.out.println("");
                System.out.println("Go to the store and buy some more,");
                System.out.println("99 bottles of beer on the wall.");
            }
        }
         */

        /** System.out.println("I Rule");
        System.out.println("The WORLD MUAAHAHHAHAHAHHA");

        int x = 5;

        while (x >= 1) {
           System.out.println("There is still " + x + " liters of beer, keep coding!");
           x = x - 1;
       }
           System.out.println("Get more beer, and then continue on...");
        */


       /** System.out.println("Enter your address: ");
        Scanner scanner = new Scanner(System.in);
        String address = scanner.nextLine();
        System.out.println("You live at: " + address);

        System.out.println("Enter your grade: ");
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();
        if(grade > 90){
            System.out.println("Wow! you did well!");
        }else{
            System.out.println("Not bad, but you can do better next time!");
        } */


        /** Person & Developer classes
         *
         * Person p1 = new Person("John", "Snow",1);
        Person p2 = new Person ("Tyrion", "Lannister", 2);

        Developer d1 = new Developer("Linus", "Tordvalds", 5);
        Developer d2 = new Developer("Ivan", "Smith", 10);

        System.out.println(p1.getFirstName() + " " + p1.getLastName());
        System.out.println(p2.getFirstName() + " " + p2.getLastName());

        System.out.println(d1.getFirstName() + " " + d1.getLastName());
        System.out.println(d2.getFirstName() + " " + d2.getLastName());

        d2.develop("Write code");

         */



        /** Hello class
         * Hello emp1 = new Hello("john", "Snow");
        *
        * String result = emp1.getInfo();
        * System.out.println(result);
         *
         *  emp1.work(8);
         */



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
            int roll3 = monopolyDice(6);
            int roll4 = monopolyDice(6);

            if ( roll1 == roll2) {
                return monopolyRoll = roll1 + roll2 + roll3 + roll4;
            } else {
                return monopolyRoll = roll1 + roll2;
            }
            System.out.println(monopolyRoll);
        } */

        /* public double fahrenheitToCelsius(double temperatureF) {
            temperatureF = (temperatureF - 32) * 5/9;
            return temperatureF;
        }

        public void printTemperature(double temperatureF) {
            System.out.println("F: " + temperatureF);
            System.out.println("C: " + fahrenheitToCelsius(temperatureF));
        } */

        /* public String nametagText(String name) {
            String first = "Hello, my name is ";
            String complete = first + name;
            return complete;
        } */

        /* public double calculateTip(double mealCost) {
            double tip = mealCost * 0.15;
            return tip;
        } */

        /* public double absoluteValue(double kek) {
            if (kek < 0) {
                return -kek;
            } else {
                return kek;
            }
        } */

        /* public int rollDice(int sides) {
            double randomNumber = Math.random();
            randomNumber = randomNumber * sides;
            randomNumber = randomNumber + 1;
            int randomInt = (int) randomNumber;
            return randomInt;

            int roll1 = rollDice();
            int roll2 = rollDice();
            System.out.println("Roll 1: " + roll1);
            System.out.println("Roll 2: " + roll2);
        } */

        /* double randomNumber = Math.random();
        randomNumber = randomNumber * 10;
        int randomInt = (int) randomNumber;
        System.out.println(randomInt); */

        /* public double makeChange(double itemCost, double dollarsProvided) {

            double change = dollarsProvided - itemCost;
            return change;
        } */

        /* public int likePhoto(int currentLikes, String comment, boolean like) {
            System.out.println("Feedback: " + comment);
            if(like) {
                currentLikes = currentLikes + 1;
            }
            System.out.println("Number of likes: " + currentLikes);
            int returnedLikes = likePhoto(0, "Nice color!", true);
            int totalLikes = likePhoto(returnedLikes, "I like this", true);
          } */

    	/* String driver;
	driver = "Vasile";
	int letters = driver.length();
	System.out.println(letters);
	driver = driver.toUpperCase();
	System.out.println(driver); */

	/*String DriverFirstName = "Vasile si";
	String DriverLastName = "Petrica";
	System.out.println(DriverFirstName + " " + DriverLastName); */

		/*
		String language = "java";
		String feeling = "Love";
		feeling = feeling.toLowerCase();
		language = language.toUpperCase();
		System.out.println("I " + feeling + " " + language);
		*/

		/* double current = 17;
	double rate = 1.5;
	double future = current * rate;
	System.out.println(future);
	int approx = (int) future;
	System.out.println(approx); */

		/*int x = 5;
		int y = 2;
		double div = x/y;
		System.out.println(div);
		double precise = (double) x/y;
		System.out.println(precise); */

		/* String firstName = "Anatoli";
		String lastName = "Caramalac";
		String fullName = firstName + " " + lastName;
		int number = firstName.length() + lastName.length();
		//int number = 16;
		System.out.println("Hello, my name is " + fullName + ". There are " + number + " letters in my name."); */

		/* double fahrenheit = 80.0;
		double celsius;
		celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println(celsius); */

		/* boolean isLightGreen = false;
       boolean isLightYellow = false;
       if(isLightGreen) {
       	//trafic light is green
		   System.out.println("Drive!");
	   } else if (isLightYellow) {
       	System.out.println("Slow down.");
       } else { System.out.println("Stop!");
       }  */

		/* int passcode = 629;
		String coffeeType;
		switch(passcode) {
            case 555: coffeeType = "Espresso";
            break;
            case 312: coffeeType = "Vanilla latte";
            break;
            case 629: coffeeType = "Drip coffee";
            break;
            default: coffeeType = "Unknown";
            break;
        }
        System.out.println(coffeeType); */

		/* boolean canSeePlayer = false;
		boolean playerPoweredUp = true;

		if(canSeePlayer) {
            if (playerPoweredUp != true) {  //or (!playerPoweredUp)
                System.out.println("Attack!");
            } else {
                System.out.println("Run away!");
            }
        } else {
		    System.out.println("Wander.");
            } */

		/* boolean isSnowing = false;
		boolean isRaining = false;
		double temperatureF = 49;

		if (isSnowing || isRaining || temperatureF < 50.0) {
            System.out.println("Let's stay home.");
        } else {
            System.out.println("Let's go out!");
        } */

		/* String timeOfDay;
		double time = 18.0;

		if ( time >= 5 && time < 12 ) {
		    timeOfDay = "morning";
		} else if (time >= 12 && time < 20) {
        timeOfDay = "daytime";
		} else { timeOfDay = "night";
		} */

		/* int weekday = 5;
		boolean holiday = true;

		if ( (weekday >= 6 && weekday <= 7) || holiday) {
		    System.out.println("Sleep in!");
        } else if (weekday >= 1 && weekday <= 5 && !holiday) {
		    System.out.println("Wake up at 7:00");
        } else {
		    System.out.println("Wrong weekday.");
        } */

        /* int dayOfWeek = 2;
        String schedule;

       switch (dayOfWeek) {
           case 1: schedule = "Gym in the morning.";
           break;
           case 2: schedule = "Class after work.";
           break;
           case 3: schedule = "Meetings all day.";
           break;
           case 4: schedule = "Work from home.";
           break;
           case 5: schedule = "Game night after work";
           break;
           case 6: schedule = "Free!";  // case 6: case 7: default: schedule = "Free!"; or default: schedule = "Free!";
           break;
           case 7: schedule = "Free!";
           break;
           default: schedule = "Error";
           break;
       }
       System.out.println(schedule); */

        /* boolean playButton = true;

        public void playMusic(){
            if (playButton) {
                System.out.println("Music is playing");
            } else {
                System.out.println("Music is paused");
            }
        } */

        /* int temperature = 6;
        public void weatherInterpreter(temperature) {
            if (temperature > 30) {
                System.out.println("It's hot outside!");
            } else if (temperature < 5) {
                System.out.println("Brr, consider wearing a jacket");
            } else {
                System.out.println("Not too hot, not too cold");
            }
        } */

        /* public void printPhoto(int width, int height, boolean inColor) {
            System.out.println("Width = " + width + " cm");
            System.out.println("Height = " + height + " cm");
            if(inColor) {
                System.out.println("Print is full color.");
            } else {
                System.out.println("Print is black and white.");
            }
            printPhoto(30,40,true);
        } */

        }
}
