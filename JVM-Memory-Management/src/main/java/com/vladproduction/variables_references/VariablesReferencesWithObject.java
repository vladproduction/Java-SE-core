package com.vladproduction.variables_references;

/**
 * This example illustrates the differences in how primitives and objects are handled in memory.
 * Primitives are stored as values in the stack, while objects are stored in the heap and manipulated via their references.
 * This understanding is crucial for managing memory effectively and recognizing how variable references work in Java.
 * */
public class VariablesReferencesWithObject {

    public static void main(String[] args) {

        // Creating an instance of the Person class (heap memory)
        Person person = new Person("Alice", 25); //reference to the Person object is stored in the 'person' reference variable in stack memory

        // Print original person details
        System.out.println("Before modification: " + person.getName() + ", Age: " + person.getAge());

        modifyPerson(person); // Passing the reference of the object

        // Print modified person details
        System.out.println("After modification: " + person.getName() + ", Age: " + person.getAge());
    }

    /**
     * modifyPerson(person) is called, a copy of the reference to the person object is passed to the modifyPerson method.
     * This means that both person in main and p in modifyPerson refer to the same Person object in the heap.
     * */
    public static void modifyPerson(Person p) {
        // Modifying the object properties
        /**
         * Inside modifyPerson, when we call p.setName("Bob") and p.setAge(30), we are modifying the fields of the original Person object.
         * Therefore, when we print the details of person in the main method, it reflects the changes made by the modifyPerson method.
         * */
        p.setName("Bob");
        p.setAge(30);
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
        this.age = age;
    }
}
