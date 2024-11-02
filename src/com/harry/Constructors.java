package com.harry;
class MyMainEmployee{
    private int id;
    private String name;

    MyMainEmployee(){
        id = 0;
        name = "Your-Name-Here";
    }
    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }
    public MyMainEmployee(String myName){
        id = 1;
        name = myName;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
}
public class Constructors {
    public static void main(String[] args) {
        /* Constructors
        -> A Member of Function used to initialise an object while creating it
           in order to write our own constructor, we define a method with the same name
           as our class.
           We can overload constructors like method
           Constructors can take parameters without being overloaded
         */
        //MyMainEmployee harry = new MyMainEmployee("ProgrammingWithHarry", 12);
        MyMainEmployee harry = new MyMainEmployee();
        //harry.setName("CodeWithHarry");
        //harry.setId(34);
        System.out.println(harry.getId());
        System.out.println(harry.getName());
    }
}
