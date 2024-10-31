package com.harry;

// ABSTRACT
abstract class Parent2{
    public Parent2(){
        System.out.println("Mai base2 ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good afternoon");
    }
}
abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }
}

//INTERFACE
interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    int x = 45;
    void blowHornK3g();
    void blowHornmhn();
}
class AvonCycle implements Bicycle, HornBicycle{
    //public int x = 5;
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUP");
    }
    public void blowHornK3g(){
        System.out.println("Kabhi khushi kabhi gum pee pee pee pee");
    }
    public void blowHornmhn(){
        System.out.println("Main hoon naa po po po po");
    }
}


public class AbstractClassesInterfaces {
    public static void main(String[] args) {
        // Abstract
        //-> Abstract in english means -> existing in thought or as an idea without
        //   concrete existence

        //  Abstract Method
        //  so, a method that is declared without an implementation
        //  abstract void moveTo(double x,double y)

        //  Abstract Class
        //  If a class includes abstract methods, then the class itself must be
        //  declared abstract.

        // When an abstract class is a subclass, the subclass usually provides implementation
        // for all the methods in parent class. If it doesn't, it must be declared abstract
        // It is possible to create reference to an abstract class.
        // It is not possible to create an object of an abstract class.
        // we can also assign reference of an abstract class to the of a concrete subclass


        //Parent2 p = new Parent2(); -- error
        Child2 c = new Child2();
        //Child3 c3 = new Child3(); -- error


        // Interface
        // -> Interface in english is a point where two systems meet and interact.
        // In java interface is a group of related methods with empty bodies.

        AvonCycle cycleHarry = new AvonCycle();
        cycleHarry.applyBrake(1);
        // You can create properties in Interfaces
        System.out.println(cycleHarry.a);
        System.out.println(cycleHarry.x);

        // You cannot modify the properties in Interfaces as they are final
        // cycleHarry.a = 454;
        // System.out.println(cycleHarry.a);

        cycleHarry.blowHornK3g();
        cycleHarry.blowHornmhn();

        // Multiple inheritances aren't allowed in java
        // Multiple inheritance face problems when there exist methods with same signatures
        // in both the superclasses.
        // Due to such problems, java doesn't support multiple inheritances directly
        // but the similar concept can be archived by inheritance.
        // A class can implement multiple interfaces and extend a class at the same time.
        // 1) Interface in java is a bit like the class but significantly difference.
        // 2) An interface can only have method signatures, filed(constant) and default methods.
        // 3) The class implementing an interface needs to define the methods necessary, not the fields.
        // 4) You can create a reference of interface but not the object
        // 5) Interface methods are public by defaults
  }
}
