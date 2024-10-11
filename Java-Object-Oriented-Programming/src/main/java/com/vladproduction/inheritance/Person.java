package com.vladproduction.inheritance;

/**
 * this setup (final attributes: names, ages) means they are won't change throughout their lifecycle,
 * making objects more robust and easier to work with in various contexts;
 * */
public class Person {

    private final String name; // Name is set once and cannot be changed
    private final int age; // Age is also set once and cannot be changed

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name; // Returns the immutable name
    }

    public int getAge() {
        return age; // Returns the immutable age
    }
}
