package com.groundgurus.day1;

public class SwitchExample {

  public static void main(String[] args) {
    // byte, short, int, long
    // float, double
    // char

    // Java 7 - String

    String language = "British English";
    String greeting;

    switch(language) {
      case "Tagalog":
        greeting = "Kamusta";
        break;
      case "English":
      case "British English":
        greeting = "Hello";
        break;
      case "German":
        greeting = "Halo";
        break;
      default:
        greeting = "Dope!";
    }

    System.out.println(greeting);
  }
}
