package com.groundgurus.day1;

import java.util.Random;
import java.util.Scanner;

public class WhileExample {

  public static void main(String[] args) {
    // Guessing game?
    // The program will generate a random number from 1 to 10
    // The user will be ask to guess up to 3 times?
    int theNumber = new Random().nextInt(9) + 1;
    int guess = -1;
    int numOfGuesses = 0;
    boolean hasBeenGuess = false;
    Scanner input = new Scanner(System.in);

    System.out.println("Guess the number from 1 to 10");
    while (numOfGuesses < 3) {
      System.out.print("What is your guess? ");
      guess = input.nextInt();

      if (guess == theNumber) {
        hasBeenGuess = true;
        break;
      } else {
        if (guess > theNumber) {
          System.out.println("Lower!");
        } else {
          System.out.println("Higher!");
        }

        numOfGuesses++;
      }
    }

    if (hasBeenGuess) {
      System.out.println("Congratulations!");
    } else {
      System.out.println("Sorry, but the number is " + theNumber);
      System.out.println("You have failed this city!");
    }
  }
}
