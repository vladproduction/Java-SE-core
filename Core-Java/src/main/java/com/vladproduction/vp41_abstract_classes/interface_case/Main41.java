package com.vladproduction.vp41_abstract_classes.interface_case;

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
        dog.makingSound();

        /**1)abstract class - is what class is-a
         * 2)interface - is what class can do (like contract between interface and class)
         *  we can think about this as a number of methods implemented class can do  */


    }
}
