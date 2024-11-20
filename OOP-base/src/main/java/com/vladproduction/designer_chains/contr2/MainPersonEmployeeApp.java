package com.vladproduction.designer_chains.contr2;

/**
 * This design illustrates how inheritance and constructors work together in Java to facilitate code reuse and ensure proper initialization of class instances.
 * When you instantiate an Employee, it first constructs its Person superclass to ensure that all inherited attributes and behaviors are properly initialized.
 * */
public class MainPersonEmployeeApp {
    public static void main(String[] args) {
        Employee employee = new Employee("John");
        //output:
        /*Person constructor name: John
        Employee constructor name: John*/
        //both constructors are called
        //first action must be: super(name) in Employee class;
    }
}

