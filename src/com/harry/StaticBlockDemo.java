package com.harry;

class StaticBlockDemo{
    static {
    System.out.println("hello");
    // System. exit (0) ;
    }
    public static void main (String[] args) {

    System.out.println("i am in main method");
    }
    static {
        System.out.println("hello 2");
        // System. exit (0) ;
    }
}