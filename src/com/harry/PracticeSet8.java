package com.harry;

//Problem 1
class Circle {
    public int radius;
    public double a;
    Circle() {
        System.out.println("I am non param of circle");
    }
    Circle(int r) {
        System.out.println("I am circle parameterized constructor");
        this.radius = r;
    }

    public double area(){
        a = 2*Math.PI*radius*radius;
        return a;
    }
}
class Cylinder1 extends Circle{
    public int height;
    public double v;
    Cylinder1(int r, int h) {
        super(r);
        System.out.println("I am cylinder1 parameterized constructor");
        this.height = h;
    }

    public double volume(){
        v = a*height;
        return v;
    }
}

//Problem 2
class Rectangle1 {
    public int height;
    public int weidth;
    public int a;
    Rectangle1 () {
        System.out.println("I am non param of Rectangle");
    }
    Rectangle1 (int h,int w){
        System.out.println("This is a Rectangle with parameterized Constructor");
        this.height=h;
        this.weidth=w;
    }

    public int area() {
         a = height*weidth;
        return a;
    }
}
class Cuboid extends Rectangle1{
    public int length;
    public int v;
    Cuboid(int h,int w, int l){
        super(h,w);
        System.out.println("This is a Cuboid with parameterized Constructor");
        this.length = l;
    }

    public int volume() {
        v = a*length;
        return v;
    }

}

public class PracticeSet8 {
    public static void main(String[] args) {
        //Problem 1
        Cylinder1 obj = new Cylinder1(12, 4);
        System.out.println(obj.area());
        System.out.println(obj.volume());

        //Problem 2
        Cuboid objC = new Cuboid(4,5,8);
        System.out.println(objC.area());
        System.out.println(objC.volume());

    }
}
