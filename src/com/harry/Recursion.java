package com.harry;
import java.util.Scanner;

public class Recursion {

    static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        else {
            //Recursion
        return n*factorial(n-1);
        }
    }

    static int factorial_i(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        else {
            //Iterative
            int product = 1;
            for (int i = 1; i <= n; i++) { // 1 to n
                product *= i;
            }
            return product;
        }
    }

    static int fibonacci(int n){
       if (n==0){
           return 0;
       }
       else if (n==1) {
           return 1;
       }
       else {
           return fibonacci(n-1)+fibonacci(n-2);
       }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a Number ");
        int num = scn.nextInt();

        System.out.println("The Factorial of the Number is Using Recursion: "+factorial(num));
        System.out.println("The Factorial of the Number is Using Iterative: "+factorial_i(num));

        System.out.println("The Fibonacci Numbers are: ");
        for (int i=0;i<num;i++){
            System.out.println(fibonacci(i));
        }
    }
}
