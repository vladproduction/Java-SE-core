package com.vladproduction.java8interfaces.dimondshapedproblemsolution;

/**
 * assume Interface1 and Interface2 taken from previous example;
 * To solve this situation, the Class1 class must provide its own implementation of the default methods.
 * In this case, it repeats the code of the interface methods. Let's describe the Main class, in which we create
 * an object of the Class1 class and call the log() method on it. As a result, we will see that a new implementation of this method is executed.
 * */
public class Class1 implements Interface1, Interface2 {
    @Override
    public void method2() {
        // ...
    }
    @Override
    public void method1(String str) {
        // ...
    }
    //here is the common implementation of the same default methods from both interfaces
    @Override
    public void log(String str) {
        System.out.println("Class1. Logging : " + str);
    }
}

