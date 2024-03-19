package com.vladproduction.vp48_enum;

/**
 * Created by vladproduction on 19-Mar-24
 */

public class MainAnimal {
    public static void main(String[] args) {
        Animal animal = Animal.CAT;

        switch (animal){
            case DOG:
                System.out.println("Dog selected");
                break;
            case BIRD:
                System.out.println("Bird selected");
                break;
            case CAT:
                System.out.println("Cat selected");
                break;
            default:
                System.out.println("Animal undefined");
        }

        System.out.println("-----------------------------");
        System.out.println(animal);
        String message = animal.getMessage();
        System.out.println("message = " + message);
        /**CAT --> toString() is not overridden yet
         message = cat jumping high

         cat jumping high --> toString() is overridden
         message = cat jumping high*/


    }
}
