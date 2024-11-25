package com.vladproduction.interfaces.multiimplementssamedata;

public class SomeClass implements Interface1, Interface2 {
    @Override
    public String someMethod() {
        System.out.println("In interface2 = " + Interface2.someField);
        return "It Works";
    }
}
