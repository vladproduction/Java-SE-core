package com.vladproduction.vp26_interfaces;

/**
 * Created by vladproduction on 06-Mar-24
 */

public class Person implements Info{

    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    @Override
    public void showInfo() {
        System.out.println("Name is: " + name);
    }
}
