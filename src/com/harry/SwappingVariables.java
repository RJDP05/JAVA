package com.harry;

public class SwappingVariables {
    public static void main(String[] args) {
     int x=5,y=6,temp;
     temp=x;
     x=y;
     y=temp;

        System.out.println("x:"+x);
        System.out.println("y:"+y);
    }
}