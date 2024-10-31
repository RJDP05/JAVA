package com.harry;

public class Loops {
    public static void main(String[] args) {
        int i=1;
        //Infinity loop se laptop Garam Hota Hai

        while (i<=3){
            System.out.println(i);
            i++;
        // while (1)
            // Can't run in java but in C & C++
            // so coders only use true/false || not 1-infinty/0
        }

        int b=0;
        do{
            System.out.println(b);
            b++;
        }while (b<=5);

        for (int j=1;j<=10;j++){
            System.out.println(j);

            if (j==3){
                System.out.println("Ending the Whole loop");
                break; //Means Ending of loop
            }

            System.out.println("j");
        }

        for (int j=1;j<=10;j++){
            System.out.println(j);

            if (j==2){
                System.out.println("Ending the Loop Not Printing j for one time");
                continue; //Means only this condition j will not print
            }
            System.out.println(j);
        }


        System.out.println("Great");
    }
}
