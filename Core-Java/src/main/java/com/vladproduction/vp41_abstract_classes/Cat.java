package com.vladproduction.vp41_abstract_classes;

/**
 * Created by vladproduction on 18-Mar-24
 */

public class Cat extends Animal{

    public void sound(){
        System.out.println("Cat sound");
    }

    @Override
    public void makeSound() {
        System.out.println("came from abstract - sound cat");
    }
}
