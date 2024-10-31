package com.harry;
//Using Math.PI for more accurate value of PI, we should store PI value in double

import java.util.Scanner;

    //Problem 1
class Cylinder{
    private int r;
    private int h;
    private int nr;
    private int nh;
    public void getRadius(){
        System.out.println("Radius: "+r);
    }
    public void getHeight(){
        System.out.println("Height: "+h);
    }
    public void setRadius(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Set Radius of the Cylinder: ");
        nr = scn.nextInt();
        r = nr;
    }
    public void setHeight(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Set Height of the Cylinder: ");
        nh = scn.nextInt();
        h = nh;
    }
    public void getVolume(){
        double a = Math.PI*r*r*h;
        System.out.format("Volume of the Cylinder: %.2f \n",a);
    }
    public void getSurfaceArea(){
        double sa = 2*Math.PI*r*(h+r);
        System.out.format("Surface Area of the Cylinder: %.2f \n",sa);
    }

    //Problem 2 (alt + insert) for generate constructor
//    public Cylinder(int r, int h) {
//        this.r = r; means this.r assignee to input r
//        this.h = h; means this.h assignee to input h
//    }
}

    //Problem 3
class Rectangle{
        private int l;
        private int b;

        public Rectangle() {
            this.l = 4;
            this.b = 5;
        }
        public Rectangle(int l, int b) {
            this.l = l;
            this.b = b;
        }
        public void getLength() {
            System.out.println(l);
        }
        public void getBreadth() {
            System.out.println(b);
        }
    }


public class PracticeSet7 {
    public static void main(String[] args) {

        //Problem 1
        Cylinder cldr = new Cylinder();
        cldr.setRadius(); //if we use int in place of void then we have to used system.out.println()
        cldr.setHeight();
        cldr.getRadius();
        cldr.getHeight();
        cldr.getVolume();
        cldr.getSurfaceArea();

        //Problem 2
        //Cylinder cldr = new Cylinder(r,h);

        //Problem 3
        Rectangle rec2 = new Rectangle(7,8);
        rec2.getLength();
        rec2.getBreadth();
        Rectangle rec = new Rectangle();
        rec.getLength();
        rec.getBreadth();

    }
}
