package com.vladproduction.app21.upcasting_downcasting;

public class Cat extends Animal{

    @Override
    void animalMethod() {
        System.out.print("Cat method + ");
        super.animalMethod();
    }

    public void purr(){
        System.out.println("purrrrrrr");
    }
}
