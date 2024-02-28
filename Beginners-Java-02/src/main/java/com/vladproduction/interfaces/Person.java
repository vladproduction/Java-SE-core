package com.vladproduction.interfaces;

public class Person implements HumanInterface {

    private int age;

    public Person(int age) {
        this.age = age;
    }

    @Override
    public void talk() {
        System.out.println("I can talk");
    }

    @Override
    public void walk() {
        System.out.println("I can walk");
    }

    @Override
    public int getAge() {
        return this.age;
    }
}
