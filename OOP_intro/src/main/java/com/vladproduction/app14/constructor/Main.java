package com.vladproduction.app14.constructor;

public class Main {
    public static void main(String[] args) {

        //Default constructor
        DefaultConstructor defaultConstructor = new DefaultConstructor();
        defaultConstructor.sum();

        //Parameterized constructor
        ParameterizedConstructor parameterizedConstructor = new ParameterizedConstructor(100, 200);
        parameterizedConstructor.sum();

        // 30
        // 300

        //overloaded constructors demonstration
        BoxOverloadConstructor boxOverloadConstructor1 = new BoxOverloadConstructor(10, 20, 30);
        BoxOverloadConstructor boxOverloadConstructor2 = new BoxOverloadConstructor(10);
        BoxOverloadConstructor boxOverloadConstructor3 = new BoxOverloadConstructor();

        System.out.println(boxOverloadConstructor1.volume());
        System.out.println(boxOverloadConstructor2.volume());
        System.out.println(boxOverloadConstructor3.volume());

    }
}
