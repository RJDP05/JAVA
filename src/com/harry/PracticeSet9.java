package com.harry;

//Problem 1
abstract class Pen {
    abstract public void write();
    abstract public void refill();
}
class FountainPen extends Pen{
    @Override
      public void write(){
        System.out.println("Writing");
    }
    @Override
     public void refill(){
        System.out.println("Refilling the Pen");
    }
    public void changeNib(){
        System.out.println("Changing Nib");
    }
}

//Problem 2
class Monkey {
    public void jump(){
        System.out.println("Jumping");
    }
    public void bite(){
        System.out.println("Biting");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    @Override
    public void eat(){
        System.out.println("Eat");
    }
    @Override
    public void sleep(){
        System.out.println("Sleep");
    }
    void comding(){
        System.out.println("Comding");
    }
    void repeat(){
        System.out.println("Repeat");
    }

}

//Problem 3
abstract class Telephone{
    abstract public void ring();
    abstract public void lite();
    abstract public void disconnect();
        }
class SmartPhone1 extends Telephone{
    public void ring(){
        System.out.println("Ringing");
    }
    public void lite(){
        System.out.println("Flash");
    }
    public void disconnect(){
        System.out.println("Disconnected");
    }
    void game(){
        System.out.println("Gaming");
    }
}

//Problem 4
interface TVRemote{
    void changeChannel();
    void changeVolume();
}
interface SmartTVRemote extends TVRemote{
    void youtube();
}
class TV implements TVRemote{
    @Override
    public void changeChannel(){
        System.out.println("Changing Channel");
    }
    @Override
    public void changeVolume(){
        System.out.println("Changing Volume");
    }
    void playStation(){
        System.out.println("Playing Games");
    }
}

public class PracticeSet9 {
    public static void main(String[] args) {
        // Problem 1
        System.out.println("Problem 1");
        FountainPen f = new FountainPen();
        f.write();
        f.refill();
        f.write();
        f.changeNib();

        //Problem 2 + Polymorphism
        System.out.println("Problem 2");
        Human h = new Human();
        h.eat();
        h.comding();
        h.jump();
        h.bite();
        h.sleep();
        h.repeat();
        Monkey m = new Human();
        m.bite();
        m.jump();
        BasicAnimal b = new Human();
        b.eat();
        b.sleep();

        //Problem 3
        System.out.println("Problem 3");
        Telephone t = new SmartPhone1();
        t.ring();
        t.lite();
        t.disconnect();
        //t.game(); -> Not allowed

        //Problem 4
        System.out.println("Problem 4");
        TV tv = new TV();
        tv.changeChannel();
        tv.changeVolume();
        tv.playStation();


    }
}
