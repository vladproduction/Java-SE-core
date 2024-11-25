package com.vladproduction.java8interfaces.dimondshapedproblem;

/**
 * issue arising in both same default methods from both interfaces
 * compiler does not know which implementation have to be taken
 *
 * Consider an example in which:
 * We describe an interface Interface1 with an abstract method method1() and a default method log().
 * We describe an interface Interface2 with an abstract method method2() and a default method log().
 * We describe a class Class1 that implements both of these interfaces, and we only override the abstract methods,
 * because we know that we don’t need to override the default methods.
 * We get a compilation error: there are two methods with the same signature in the class scope, even though they have the same implementation.
 * The compiler doesn’t check the code for matches.
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
    //just for compiling overriding this method
    @Override
    public void log(String str) {
        Interface1.super.log(str);
    }
}

