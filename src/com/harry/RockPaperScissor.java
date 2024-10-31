package com.harry;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Rock-Paper-Scissor");
//
//        System.out.println("Player1's Call: ");
//        String p1 = scn.nextLine();
//        System.out.println("Player2's Call: ");
//        String p2 = scn.nextLine();
//
//        if (p1.equalsIgnoreCase("Rock") && p2.equalsIgnoreCase("Scissor")){
//            System.out.println("Player1 Wins");
//        }
//        else if (p1.equalsIgnoreCase("Rock") && p2.equalsIgnoreCase("Paper")) {
//            System.out.println("Player2 Wins");
//        }
//        else if (p1.equalsIgnoreCase("Scissor") && p2.equalsIgnoreCase("Rock")) {
//            System.out.println("Player2 Wins");
//        }
//        else if (p1.equalsIgnoreCase("Scissor") && p2.equalsIgnoreCase("Paper")) {
//            System.out.println("Player1 Wins");
//        }
//        else if (p1.equalsIgnoreCase("Paper") && p2.equalsIgnoreCase("Rock")) {
//            System.out.println("Player1 Wins");
//        }
//        else if (p1.equalsIgnoreCase("Paper") && p2.equalsIgnoreCase("Scissor")) {
//            System.out.println("Player2 Wins");
//        }
//        else if (p1.equalsIgnoreCase("Paper") && p2.equalsIgnoreCase("Paper")) {
//            System.out.println("Draw!!");
//        }
//        else if (p1.equalsIgnoreCase("Scissor") && p2.equalsIgnoreCase("Scissor")) {
//            System.out.println("Draw!!");
//        }
//        else if (p1.equalsIgnoreCase("Rock") && p2.equalsIgnoreCase("Rock")) {
//            System.out.println("Draw!!");
//        }
//        else{
//            System.out.println("Wrong Call!!!");
//        }

        // 0 for Rock
        // 1 for Paper
        // 2 for Scissor

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 0 for Rock, 1 for Paper, 2 for Scissor ");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if (userInput == computerInput) {
            System.out.println("Draw");
        }
        else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0
                || userInput == 2 && computerInput == 1) {
            System.out.println("You Win!");
        } else {
            System.out.println("Computer Win!");
        }
        // System.out.println("Computer choice: " + computerInput);
        if(computerInput==0){
            System.out.println("Computer choice: Rock");
        }
        else if(computerInput==1){
            System.out.println("Computer choice: Paper");
        }
        else if(computerInput==2){
            System.out.println("Computer choice: Scissors");
        }
    }
}
