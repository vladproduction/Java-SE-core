package com.vladproduction.interfaces.multiimplementssamedata;

/**
 * For example: let's describe two interfaces Interface1 and Interface2, each of which has a field
 * someField (of a different type) and an abstract method someMethod().
 * Let's describe the SomeClass class, which implements both of these interfaces.
 * This class defines the implementation of the someMethod() method, common to both interfaces.
 * Let's describe the MainSomeClassApp class, in which we will consider different ways of accessing the fields and the method.
 * */
public class MainSomeClassApp {
    public static void main(String[] args) {
        SomeClass obj = new SomeClass();
        System.out.println(obj.someMethod());
        System.out.println(((Interface2) obj).someMethod());
        System.out.println(((Interface1) obj).someField);
        System.out.println(Interface1.someField);
        /*In interface2 = 200.5
        It Works
        In interface2 = 200.5
        It Works
        100
        100*/
    }
}
