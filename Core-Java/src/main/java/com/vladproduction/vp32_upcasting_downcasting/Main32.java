package com.vladproduction.vp32_upcasting_downcasting;

/**
 * Created by vladproduction on 07-Mar-24
 */

public class Main32 {
    public static void main(String[] args) {

        //--------widening (upcasting)--------------
        Dog dog = new Dog(); // Create a Dog object
        Animal animalRef = dog; // Upcasting: Assign the Dog object to an Animal reference
        animalRef.makeSound(); // Calls Animal's makeSound() (allowed due to upcasting)

        //-------narrowing (dowcasting)---------------
        Animal animalRef1 = new Dog(); // Upcast the Dog object to an Animal reference
        Dog downcastedDog = (Dog) animalRef1; // Downcast the Animal reference to a Dog reference (explicit cast needed)
        downcastedDog.makeSound(); // Now calls Dog's specific makeSound() due to downcasting

        //--------------ClassCastException: Animal cannot be cast to Dog------------------------------
//        Animal animal = new Animal();
//        Dog dog1 = (Dog) animal;
//        dog1.bark();


    }
}
