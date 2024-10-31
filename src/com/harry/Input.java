package com.harry;

import java.util.Scanner;
//Scanner class import from the java library

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//System.in is for taking input from keyboard
        // Scanner sc for creating an object

        System.out.println("Enter Ur Name: ");
        String name = sc.nextLine(); /*string is datatype and name is variable and .nextLine()
        is method to read from the keyboard which input is basically character type*/
        System.out.println("How Old Are U: ");
        int age = sc.nextInt();/*.nextInt() is method to read from the keyboard which input is
        basically integer type*/
        sc.nextLine();
        //\n enter in this nextLine or game could not print
        System.out.println("Enter Ur Favorite Game: ");
        String game = sc.nextLine();/*sc.next only print the first word of the sentence; therefore,
        we use nextLine*/

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old WOW!");
        System.out.println("Ur Favorite Game is " + game);

    }
}