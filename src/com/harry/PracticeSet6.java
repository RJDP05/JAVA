package com.harry;
//class Employee{} we can't create a new class which already exist in package
import java.util.Scanner;

class employee{
    //Property
    String name;
    int salary;

    //Method 1
    public void getSalary(){
        System.out.println(salary);
    }

    //Method 2
    public void getName(){
        System.out.println(name);
    }

    //Method 3
    public void setName(String n){
        name = n;
    }
}

public class PracticeSet6 {
    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);

    employee emp1 = new employee();
    employee emp2 = new employee();

    System.out.println("Enter Ur Name:");
    emp1.name = scn.nextLine();
    System.out.println("Enter Ur Salary:");
    emp2.salary = scn.nextInt();


    emp1.getName();
    emp2.getSalary();

    System.out.println("Enter new Name:");
    String set = scn.nextLine();
    emp1.setName(set);
    emp2.getName();


    }
}
