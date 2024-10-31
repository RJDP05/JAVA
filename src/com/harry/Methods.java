package com.harry;
// Functions in C/C++ = Methods in Java

public class Methods {
    static int logic(int x, int y) {
        // Static keyword is used to associate a method of a given class with the class rather
        // than the object static method in a class is shared by all the objects
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        x = 566; // The values from the method call (a and b) are copied to the a and b function
        // Thus even if we modify the values of a and b inside the method, the values in main
        // method will not change
        return z;
    }

    static void foo(){
        System.out.println("Good Morning bro!");
    }

    static void foo(int a){
        System.out.println("Good morning " + a + " bro!");
    }

    static void foo(int a, int b){
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }

    static void foo(int a, int b, int c){
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }

    static void change(int a){
        a = 98;
    }

    static void change2(int [] arr){
        arr[0] = 98;
    }


    public static void main(String[] args) {
        // when we don't want our method to return anything, we use void as return type
        int a = 5;
        int b = 7;
        int c;
        // If we don't use 'static' while creating methods
        // Method invocation using Object creation
        // Methods obj = new Methods();
        // c = obj.logic(a, b);
        c = logic(a, b); //a,b value will copy in x,y
        System.out.println(a + " " + b);
        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 = logic(a1, b1);
        System.out.println(c);
        System.out.println(c1);


        //Case 1: Changing the Integer
        int x = 45;
        change(x);
        System.out.println("The value of x after running change is: " + x);

        // Case 2: Changing the Array
         int [] marks = {52, 73, 77, 89, 98, 94};
         change2(marks);
         System.out.println("The value of x after running change is: " + marks[0]);
         // In the case of array the reference is passed. Same is the case for object passing
         // to methods.


        // Method Overloading
        //-> Two or more methods have same name but different parameters. Such methods are called
        //   Overloaded Methods.
        foo();
        foo(3000);
        foo(3000, 4000);
        foo(5000,7000,8000);
        // Arguments are actual!
        // Method overloading cannot be performed by changing the return type of methods
        }
}


