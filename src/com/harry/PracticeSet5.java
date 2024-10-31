package com.harry;
import java.util.Scanner;

public class PracticeSet5 {

    //Problem 1
    static void Table(int n){
        System.out.println("The Table of the Number is:");
        for (int i =1;i<=10;i++){
            int t;
            t = n*i;
            System.out.format("%dx%d=%d \n",n,i,t);
        }
    }

    //Problem 2
    static void Pattern1(int n){
        for (int i =0;i<=n;i++){
            for (int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    //Problem 3
    static int Sum(int n){
        if (n==1){
            return 1;
        }
        return n+Sum(n-1);
    }

    //Problem 4
    static void Pattern2(int n){
        for (int i =0;i<n;i++){
            for (int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    //Problem 5
    static int Avg(int ...arr){
        int result = 0;
        for (int a : arr){
            result += a;
        }
        return result/ arr.length;
    }

    //Problem 6
    static void Pattern1_rec(int n){
        if(n>0){
            Pattern1_rec(n-1);
            for (int j=0;j<n;j++){
                System.out.print("* ");
                }
            System.out.println("");
            }
        }

    //Problem 7
    static void Pattern2_rec(int n){
        if (n == 0) {
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();

        Pattern2_rec(n - 1);
    }

    //Problem 8
    static float C2F(float n){
        float f;
        f=1.8f*n+32;
        return f;
    }

    //Problem 9
    static int Sum_Itera(int n){
        int s = 0;
        if (n==1){
            return 1;
        }
        else {
            for (int i = 1;i<=n;i++){
                s+=i;
            }
        }
        return s;
    }




    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        //Problem 1
        System.out.println("Enter a Number: ");
        int ta = scn.nextInt();
        Table(ta);

        //Problem 2
        System.out.println("Enter a Random Number for Pattern1: ");
        int p1 = scn.nextInt();
        Pattern1(p1);

        //Problem 3
        System.out.println("Enter Number of Terms of Natural Numbers for Sum Using Recursion: ");
        int s = scn.nextInt();
        System.out.println(Sum(s));

        //Problem 4
        System.out.println("Enter a Random Number for Pattern2: ");
        int p2 = scn.nextInt();
        Pattern2(p2);

        //Problem 5
        System.out.print("The Average is: ");
        System.out.println(Avg(1,3,8,7,9,8));

        //Problem 6
        System.out.println("Enter a Random Number for Pattern2 Using Recursion: ");
        int p1r = scn.nextInt();
        Pattern1_rec(p1r);

        //Problem 7
        System.out.println("Enter a Random Number for Pattern2 Using Recursion: ");
        int p2r = scn.nextInt();
        Pattern2_rec(p2r);

        //Problem 8
        System.out.println("Enter Temperature in Celsius: ");
        float c = scn.nextFloat();
        System.out.println("The Temperature in Fahrenheit is: "+C2F(c));

        //Problem 9
        System.out.println("Enter Number of Terms of Natural Numbers for Sum Using Iterative: ");
        int su = scn.nextInt();
        System.out.println(Sum_Itera(su));



    }
}
