package com.vladproduction.enum_example;


import static com.vladproduction.enum_example.Personality.*;

public class Main01 {
    public static void main(String[] args) {

        Person bob = new Person(23, MALE);
        System.out.println(bob.getAge());
        bob.talk();

        UFO ufo = new UFO(3000, ALIEN);
        System.out.println(ufo.getAge());
        ufo.talk();
    }
}
