package com.vladproduction.assignment1;

public class Main {
    public static void main(String[] args) {

        //create an instances
        Employee john = new Employee("John", 34, 70000, StateLocation.NY);
        Employee bob = new Employee("Bob", 32, 60000, StateLocation.MIS);

        //using function
        bob.raiseSalary();

        //print info salary after we used raised
        System.out.println(john.salary);
        System.out.println(bob.salary); //is raised on 20%


    }
}
