package com.vladproduction.app06.override_method;

public class Developer extends Employee{

    private String level;

    public Developer(String name, int age, String role, String level) {
        super(name, age, role);
        this.level = level;
    }

    @Override
    public void greeting() {
        System.out.println("Hi there, my name is " + super.getName() + " I`m " + super.getRole() + ". My level is " + level);
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "level='" + level + '\'' +
                "} " + super.toString();
    }
}
