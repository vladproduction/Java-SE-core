package com.vladproduction.oop.encapsulation;

/**
 * Encapsulation is the bundling of data (variables) and methods that operate on the data into a single unit, or class.
 * It restricts direct access to some of an object's components,
 * which is a means of preventing accidental interference and misuse of the methods and data.
 * */

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John Doe");
        person.setAge(25);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}
