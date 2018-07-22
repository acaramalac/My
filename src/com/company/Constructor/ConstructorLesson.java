package com.company.Constructor;

import jdk.nashorn.internal.ir.annotations.Ignore;

@Ignore
public class ConstructorLesson {

    public static void main(String args[]){

        Birds bird = new Birds("Уарабей", true);

        System.out.println(bird.getName());
        if(bird.isCanFly() == true){
            System.out.println("И я умею летать");
        } else {
            System.out.print("Но я не умею летать :(");
        }
    }
}
