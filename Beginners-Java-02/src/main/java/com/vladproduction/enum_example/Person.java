package com.vladproduction.enum_example;

public class Person implements HumanInterface {

    private int age;
    private Personality personality;

    public Person(int age, Personality personality) {
        this.age = age;
        this.personality = personality;
    }

    @Override
    public void talk() {

        System.out.println("I can talk");
        System.out.println("I`m " + this.personality);
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
