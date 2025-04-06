package com.vladproduction.association;

//One-to-One associating
public class Person {

    private String name;
    private Passport passport; // One-to-One: A Person has one Passport

    public Person(String name) {
        this.name = name;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public Passport getPassport() {
        return passport;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person: " + name;
    }

}
