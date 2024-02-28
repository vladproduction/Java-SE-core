package com.vladproduction.enum_example;

import com.vladproduction.interfaces.HumanInterface;
import com.vladproduction.interfaces.Person;

public class UFO implements HumanInterface {
    private int age;
    private Personality personality;

    public UFO(int age, Personality personality) {
        this.age = age;
        this.personality = personality;
    }

    @Override
    public void talk() {

        System.out.println("I can talk as UFO");
        System.out.println("I`m " + this.personality);
    }

    @Override
    public void walk() {
        System.out.println("I can walk as UFO");
    }

    @Override
    public int getAge() {
        return this.age;
    }
}
