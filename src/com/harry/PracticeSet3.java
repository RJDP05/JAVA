package com.harry;

import java.util.Scanner;

public class PracticeSet3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        //Problem 1
        System.out.println("Enter The Number of Rows");
        int r = scn.nextInt();

        for (int i=0;i<r;i++){
            for(int j=0;j<r-i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        //Problem 2
        System.out.println("Enter The Number");
        int t = scn.nextInt();

        for (int i=1;i<=10;i++){
            int a=t*i;
            System.out.println(a);
        }

        //Problem 3
        System.out.println("Enter The Number");
        int re = scn.nextInt();

        for (int i=10;i>0;i--){
            int a=re*i;
            System.out.println(a);
        }

        //Problem 4
        System.out.println("Enter The Number");
        int n = scn.nextInt();
        int f =1;
        while (n>0){
            f = f * n;
            n--;
        }
        System.out.println(f);

    }
}
