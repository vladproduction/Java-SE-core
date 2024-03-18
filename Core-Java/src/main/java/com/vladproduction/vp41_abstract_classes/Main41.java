package com.vladproduction.vp41_abstract_classes;

/**
 * Created by vladproduction on 18-Mar-24
 */

public class Main41 {
    public static void main(String[] args) {

//        Animal animal = new Animal(); //can`t to instantiate, Animal is abstract class
        Cat cat = new Cat();
        cat.sound();
        cat.makeSound();
        cat.eat();
        System.out.println("-------------");
        Dog dog = new Dog();
        dog.sound();
        dog.makeSound();
        dog.eat();

        /**abstract class - is what class is
         * interface - is what class can do*/


    }
}
