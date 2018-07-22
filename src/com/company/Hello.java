
package com.company;

import jdk.nashorn.internal.ir.annotations.Ignore;
@Ignore

public class Hello {

  String firstName;
  String lastName;

    Hello (String firstName, String lastName) {

      this.firstName = firstName;
      this.lastName = lastName;

  }

  public String getInfo() {
      String result = "My name is " + firstName + " " + lastName;
      return result;
  }

  public void work(int hours) {
        System.out.println("I'm gonna work for " + hours + " hours!");
  }

  public void work(int hours, long mseconds) {

  }

}