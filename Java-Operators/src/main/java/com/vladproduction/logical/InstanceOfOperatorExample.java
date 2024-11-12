package com.vladproduction.logical;

public class InstanceOfOperatorExample {
    public static void main(String[] args) {

        String name = "test";
        boolean isTrue = name instanceof String;
        System.out.println("isTrue = " + isTrue);

        Animal animal = new Animal();
        if(animal instanceof Animal){
            System.out.println("Animal class instance!");
        }
    }
}


