package com.vladproduction.vp41_abstract_classes.interface_case;

/**
 * Created by vladproduction on 18-Mar-24
 */

public class Dog extends Animal implements AbleToSound {

    public void sound(){
        System.out.println("Dog sound");
    }

    @Override
    public void makeSound() {
        System.out.println("came from abstract - sound dog");
    }

    @Override
    public void makingSound() {
        System.out.println("came from interface - sound dog: bark");
    }
}
