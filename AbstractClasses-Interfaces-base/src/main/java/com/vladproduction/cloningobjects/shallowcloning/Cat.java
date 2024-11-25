package com.vladproduction.cloningobjects.shallowcloning;

public class Cat implements Cloneable {
    private int age;
    private String name;

    public Cat(int year, String name) {
        this.age = year;
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException { //overridden to avoid exception
        return super.clone();
    }

    public String toString() {
        return "Age = " + age + ", name = " + name;
    }
}
