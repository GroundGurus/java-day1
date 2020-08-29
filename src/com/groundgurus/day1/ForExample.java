package com.groundgurus.day1;

public class ForExample {

  public static void main(String[] args) {
    // i = iterator
//    for (int i = 1; i <= 10; i += 2) {
//      System.out.println(i);
//    }

    // 10 to 1
    for (int i = 10; i >= 1; i--) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }

    String colors = "red,blue,green";
    String[] colorsArray = colors.split(","); // length = 3

    // traditional for loop
    for (int i = 0; i < colorsArray.length; i++) {
      System.out.println(colorsArray[i]);
    }

    // enhanced for loop/foreach, Java 5
    for (String color : colorsArray) {
      System.out.println(color);
    }
  }
}
