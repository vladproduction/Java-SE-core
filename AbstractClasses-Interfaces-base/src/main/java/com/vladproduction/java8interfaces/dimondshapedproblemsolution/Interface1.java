package com.vladproduction.java8interfaces.dimondshapedproblemsolution;

public interface Interface1 {
    void method1(String str);
    default void log(String str) {
        System.out.println("The default method. Logging: " + str);
    }
}
