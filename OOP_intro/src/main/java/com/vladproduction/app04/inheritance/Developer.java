package com.vladproduction.app04.inheritance;

public class Developer extends Employee{

    private final String level;

    public Developer(String firstName, String lastName, int age, int inn, int phoneNumb, String role, String level) {
        super(firstName, lastName, age, inn, phoneNumb, role);
        this.level = level;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + "; level = %s", level);
    }
}
