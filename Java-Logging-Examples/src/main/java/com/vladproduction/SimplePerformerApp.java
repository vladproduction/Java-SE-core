package com.vladproduction;

public class SimplePerformerApp {
    public static void main(String[] args) {
        // Create a PersonRecord instance (immutable)
        PersonRecord johnRecord = new PersonRecord("John", 30);
        System.out.println("Using PersonRecord:");
        System.out.println(johnRecord);
        System.out.println(johnRecord.fullDescription());
        System.out.println("Is John an adult? " + johnRecord.isAdult());

        // Create another PersonRecord instance
        PersonRecord janeRecord = new PersonRecord("Jane", 17);
        System.out.println("Using PersonRecord:");
        System.out.println(janeRecord);
        System.out.println(janeRecord.fullDescription());
        System.out.println("Is Jane an adult? " + janeRecord.isAdult());
        System.out.println(PersonRecord.compareAges(johnRecord, janeRecord));

        System.out.println(); // Adding a line break for clarity

        // Create a Person instance (mutable)
        Person john = new Person("John", 30);
        System.out.println("Using Person:");
        System.out.println(john);
        System.out.println(john.fullDescription());
        System.out.println("Is John an adult? " + john.isAdult());

        // Modify John’s age and name
        john.setAge(31);
        john.setName("John Doe");
        System.out.println("After updating John's details:");
        System.out.println(john);
        System.out.println(john.fullDescription());

        // Create another Person instance
        Person jane = new Person("Jane", 17);
        System.out.println("Using Person:");
        System.out.println(jane);
        System.out.println(jane.fullDescription());
        System.out.println("Is Jane an adult? " + jane.isAdult());
        System.out.println(Person.compareAges(john, jane));
    }
}
