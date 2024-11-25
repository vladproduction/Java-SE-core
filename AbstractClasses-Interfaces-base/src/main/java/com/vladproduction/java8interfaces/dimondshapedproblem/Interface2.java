package com.vladproduction.java8interfaces.dimondshapedproblem;

public interface Interface2 {

    void method2();

    default void log(String str) {
        System.out.println("The default method. Logging: " + str);
    }
}
