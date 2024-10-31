package com.harry;

import java.util.Random;
import java.util.Scanner;

class RandomNumber{

    int n;
    int computerInput;
    int attempts;
      public void  comNumber() {
          System.out.println("Computer Generate a Random Number Between 0 to 50 ->");
          Random ran = new Random();
          computerInput = ran.nextInt(50);
      }
      public void  takeUserInput(){
          do {System.out.println("Guess a Number:");
              Scanner scn = new Scanner(System.in);
              n = scn.nextInt();
              if (n>computerInput) {
                System.out.println("Ur Guess is HIGHER than the Value!!");
                }
              else if(n<computerInput) {
                System.out.println("Ur Guess is LOWER than the Value!!");
                }
              attempts++;
             } while (n!=computerInput);
      }
      public void isCorrectNumber() {
        System.out.println("Ur Guess is Correct !!!");
      }
      public void tries(){
          System.out.println("Numbers of Tries: "+attempts);
      }
}


public class GuessTheNumber {
    public static void main(String[] args) {
//        Create a class Game, which allows a user to play "Guess the Number" game once.
//
//        Game should have the following methods:
//        Constructor to generate the random number
//        takeUserInput() to take a user input of number
//        isCorrectNumber() to detect whether the number entered by the user is true
//        getter and setter for noOfGuesses
//        Use properties such as noOfGuesses(int), etc to get this task done!

          RandomNumber un = new RandomNumber();
          un.comNumber();
          un.takeUserInput();
          un.isCorrectNumber();
          un.tries();
    }
}
