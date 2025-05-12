package com.vladproduction.app21.upcasting_downcasting;

public class Dog extends Animal{

    @Override
    void animalMethod() {
        System.out.print("Dog method + ");
        super.animalMethod();
    }

    public void bark(){
        System.out.println("Woof");
    }

}
