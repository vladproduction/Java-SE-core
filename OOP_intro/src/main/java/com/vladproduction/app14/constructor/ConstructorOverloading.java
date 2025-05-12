package com.vladproduction.app14.constructor;

public class ConstructorOverloading {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.displayColor();
        d.eat();
        //or
        Dog d1 = new Dog("Elephant");

    }

    static class Animal {

        String color = "white";

        Animal(String name){
            System.out.println(name);
        }

        Animal(){
            System.out.println("Animal");
        }

        void eat(){
            System.out.println("Animal eats");
        }
    }

    static class Dog extends Animal {

        String color = "black";

        Dog(String name){
            super(name);
        }
        Dog(){
            super();
        }

        void displayColor(){
            System.out.println(super.color);
        }

        void eat(){
            super.eat();
        }


    }

}
