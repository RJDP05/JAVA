package com.harry;

public class ResultingDatatype {
    public static void main(String[] args) {
        /*
        R = b + s; int                    b = byte
        R = i + s; int                    s = short
        R = l + f; float                  i = integer
        R = i + f; float                  l = long
        R = c + i; int                    d = double
        R = c + s; int                    f = float
        R = l + d; double                 c = character
        R = f + d; double
         */

        //increment & Decrement
        char ch = 'a';
        System.out.println(++ch);
        //output b
        char cha = 'A';
        System.out.println(++cha);
        //output B

        //type cast
        char grade ='B';
        //grade = grade + 8; this is wrong
        grade = (char) (grade + 8);
        //grade += 8; or is right
        System.out.println(grade);
    }
}
