package com.harry;

import java.util.Scanner;

class Subject {
    int obtain;
}

public class BoardPercentage {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        Subject s1 = new Subject();
        System.out.println("Enter The Marks of Subject1: ");
        s1.obtain = scn.nextInt();
        Subject s2 = new Subject();
        System.out.println("Enter The Marks of Subject2: ");
        s2.obtain = scn.nextInt();
        Subject s3 = new Subject();
        System.out.println("Enter The Marks of Subject3: ");
        s3.obtain = scn.nextInt();
        Subject s4 = new Subject();
        System.out.println("Enter The Marks of Subject4: ");
        s4.obtain = scn.nextInt();
        Subject s5 = new Subject();
        System.out.println("Enter The Marks of Subject5: ");
        s5.obtain = scn.nextInt();

        int total = s1.obtain + s2.obtain + s3.obtain + s4.obtain + s5.obtain;
        int per = (total*100)/500;

        System.out.println("The Percentage is "+per);

    }
}
