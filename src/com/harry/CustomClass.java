package com.harry;

class Student{
    int id;
    String name;
}

class Employee{
    int id;
    int salary;
    String name;

    //Method 1
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.print(" and my name is "+ name);
    }
    //Method 2
    public int getSalary(){
        return salary;
    }
}

public class CustomClass {
    public static void main(String[] args) {
        System.out.println("This is Custom Class: ");
        Student RJDP = new Student();
        RJDP.id = 57;
        RJDP.name = "Rajdeep Khamrai";
        System.out.println(RJDP.name);
        System.out.println(RJDP.id);

        Employee harry = new Employee(); // Instantiating a new Employee Object
        Employee john = new Employee(); // Instantiating a new Employee Object

        // Setting Attributes for Harry
        harry.id = 12;
        harry.salary = 34;
        harry.name = "CodeWithHarry";

        // Setting Attributes for John
        john.id = 17;
        john.salary = 12;
        john.name = "John The Don";

        // Printing the Attributes
        // System.out.println(harry.id);
        // System.out.println(harry.name);
        // without using the upper line we create a new object name printDetails for
        // printing attributes
        harry.printDetails();
        john.printDetails();
        int salary = john.getSalary();
        System.out.println(salary);

    }
}