package com.harry;

import java.util.Scanner;
//if,if-else,elseif,switch case

public class Conditionals {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Ur Age: ");
        int age1 = scn.nextInt();


        if(age1<18){
            System.out.println("U are a Child!");
        }
        else if(age1 >= 18 && age1 <= 60) {
            System.out.println("U can Drink!!");
        }
        else {
            System.out.println("U Should Not Drink!!!");
        }

        //Normal Switch
        System.out.println("Enter Ur Age: ");
        int age2 = scn.nextInt();
        switch (age2) {
            case 18:
                System.out.println("You become an Adult");
                break;
            case 25:
                System.out.println("Time to Serious");
                break;
            case 60:
                System.out.println("Time to Rest");
                break;
            default:
                System.out.println("Enjoy Ur Life");
        }

        // Enhanced switch
        System.out.println("Enter Ur Age: ");
        int age3 = scn.nextInt();
        switch (age3) {
            case 18 -> System.out.println("You become an Adult");
            case 25 -> System.out.println("Find a Job");
            case 60 -> System.out.println("Time to Chill Vro");
            default -> System.out.println("Enjoy Ur Life");
        }
    }
}