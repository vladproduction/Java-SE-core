package com.vladproduction;

/**
 * (mutable)
 * */
public class Person {

    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Person [name: %s, age: %d]", this.name, this.age);
    }

    public String fullDescription() {
        return String.format("Person [name: %s, age: %d].", this.name, this.age);
    }

    public boolean isAdult() {
        return this.age >= 18;
    }

    public static String compareAges(Person p1, Person p2) {
        if (p1.age < p2.age) {
            return String.format("%s is younger than %s.", p1.name, p2.name);
        } else if (p1.age > p2.age) {
            return String.format("%s is older than %s.", p1.name, p2.name);
        } else {
            return String.format("%s and %s are the same age.", p1.name, p2.name);
        }
    }

}
