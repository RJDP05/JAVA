package com.harry;

class EkClass{
    int a;
    public int getA() {
        return a;
    }
    EkClass(int a){
        this.a = a;
    }
    public int returnone(){
        return 1;
    }
}
class DoClass extends EkClass{ DoClass(int c){ super(c);
    System.out.println("I am a constructor"); }
}
public class Keywords {
    public static void main(String[] args) {
        // this.a
        // This is a way for us to reference an object of the class which is being
        // created / reference.
        // super(a,b) -> claas the constructor from the parent class which takes 2 variables
        // A reference variable used to refer an immediate parent class object
        // can be used to refer immediate parent class instance variable
        // can be used to invoke parent class methods
        // can be used to invoke parent class constructors

        EkClass e = new EkClass(65);
        DoClass d = new DoClass(5);
        System.out.println(e.getA());
    }
}
