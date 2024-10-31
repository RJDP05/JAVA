package com.harry;

class A{
    public int a;
    public int harry(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        // If the child class implements the same method present in the parent class
        // again, it is known as method overriding
        // redefining method of superclass!
        // When an object of subclass is created and the override method is called
        // the method which has been implemented in the subclass is called
        // & it's code executed.
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();
    }
}
