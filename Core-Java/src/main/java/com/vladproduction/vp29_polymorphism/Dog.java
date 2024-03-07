package com.vladproduction.vp29_polymorphism;

/**
 * Created by vladproduction on 07-Mar-24
 */

public class Dog extends Animal{

    @Override
    public void eat() {
//        super.eat(); //from parent class
        System.out.println("Dog is eating!"); //overriding method
    }

    public void bark() {
        System.out.println("Dog is barking!");;
    }
}
