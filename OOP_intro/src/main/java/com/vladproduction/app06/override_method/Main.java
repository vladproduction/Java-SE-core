package com.vladproduction.app06.override_method;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("David", 25);
        Employee employee = new Employee("Klara", 28, "it-designer");
        Developer developer = new Developer("Bob", 31, "it-developer", "SENIOR");

//        person.greeting();
//        employee.greeting();
//        developer.greeting();

        List<Person> persons = new ArrayList<>();
        persons.add(person);
        persons.add(employee);
        persons.add(developer);

        massGreeting(persons);

    }

    private static void massGreeting(List<Person> persons) {
        for (Person obj: persons) {
            obj.greeting();
        }
    }

}
