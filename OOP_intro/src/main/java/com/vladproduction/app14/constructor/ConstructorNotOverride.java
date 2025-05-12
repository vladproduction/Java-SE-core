package com.vladproduction.app14.constructor;

public class ConstructorNotOverride {

    static class Animal {
        public Animal() {
            System.out.println("Animal");
        }
    }

    static class Dog extends Animal {

        //This constructor is not overriding the Animal's constructor
        //we cannot do: public Animal(){...}
        //constructor have to have the same name as its class
        public Dog() {
            System.out.println("Dog");
        }
    }
}
