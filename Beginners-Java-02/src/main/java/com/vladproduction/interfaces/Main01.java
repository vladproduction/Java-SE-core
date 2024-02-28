package com.vladproduction.interfaces;

public class Main01 {
    public static void main(String[] args) {

        Person bob = new Person(23);
        System.out.println(bob.getAge());
        bob.talk();

        UFO ufo = new UFO(3000);
        System.out.println(ufo.getAge());
        ufo.talk();
    }
}
