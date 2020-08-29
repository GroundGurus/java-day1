package com.groundgurus.day1;

public class IfExample {

  public static void main(String[] args) {
    System.out.println("Start of program");
    int age = 17;

    if (age >= 18 && age <= 20) { // range 18 to 20
      System.out.println("You can now enter the bar");
    } else if (age >= 21) {
      System.out.println("You are legal in this state");
    } else {
      System.out.println("Buzz of kid!");
    }

    System.out.println("End of program");
  }
}
