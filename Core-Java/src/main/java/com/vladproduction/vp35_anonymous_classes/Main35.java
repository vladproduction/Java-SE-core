package com.vladproduction.vp35_anonymous_classes;

/**
 * Created by vladproduction on 07-Mar-24
 */

public class Main35 {
    public static void main(String[] args) {
        Animal  animal = new Animal();
        animal.eat();
        OtherAnimal otherAnimal = new OtherAnimal();
        otherAnimal.eat();
        //let`s create anonymous class:
        Animal animal1 = new Animal(){
            @Override
            public void eat() {
                System.out.println("Animal anonymous eating!");
            }
        };
        animal1.eat();
    }
}

class OtherAnimal extends Animal{

    @Override
    public void eat() {
        System.out.println("OtherAnimal eating!");
    }
}

class Animal{

    public void eat(){
        System.out.println("Animal eating...");
    }

}
