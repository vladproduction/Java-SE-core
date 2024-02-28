package com.vladproduction.interfaces;

public class UFO implements HumanInterface {
    private int age;

    public UFO(int age) {
        this.age = age;
    }

    @Override
    public void talk() {
        System.out.println("I can talk as UFO");
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
