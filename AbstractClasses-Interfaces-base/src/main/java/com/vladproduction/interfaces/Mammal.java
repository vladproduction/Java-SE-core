package com.vladproduction.interfaces;

/**
 * Inheritance between Interfaces: An interface can extend another interface, inheriting its methods.
 * A single interface can extend multiple interfaces due to Java's multiple inheritance support for interfaces.
 * */
public interface Mammal extends Animal {
    void walk();
}