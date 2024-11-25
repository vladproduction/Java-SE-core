package com.vladproduction.interfaces;

/**
 * Default and Static Methods: Interfaces can provide default implementations for methods using the default keyword.
 * They can also contain static methods. These features allow interfaces to carry some implementation logic,
 * though classes are still required to implement methods that are not defaulted or static.
 * */
public interface Aquatic {
    default void dive() {
        System.out.println("Diving.");
    }

    static void report() {
        System.out.println("Report from Aquatic interface");
    }
}