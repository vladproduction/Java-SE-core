package com.vladproduction.vp34_wildcards_generics.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vladproduction on 07-Mar-24
 */

public class Main {
    public static void main(String[] args) {

        List<Animals> animalsList = new ArrayList<>();
        animalsList.add(new Animals(1));
        animalsList.add(new Animals(2));
        animalsList.add(new Animals(3));

        List<Dog> dogsList = new ArrayList<>();
        dogsList.add(new Dog());
        dogsList.add(new Dog());
        dogsList.add(new Dog());
        dogsList.add(new Dog());

        testAnimals(animalsList);
        System.out.println();
        testWildcardExtends(dogsList);
        System.out.println();
        testWildcardSuper(animalsList);

    }


    //concrete class: Animals
    private static void testAnimals(List<Animals> animalsList) {
        System.out.println("Animals");
        for (Animals animals : animalsList) {
            System.out.println(animals);
        }
    }

    //wildcard: basic class and all subclasses
    private static void testWildcardExtends(List<? extends Animals> animalsList) {
        System.out.println("extends Animals");
        for (Animals animals : animalsList) {
            animals.eat();
        }
    }

    //wildcard: basic class and all subclasses
    private static void testWildcardSuper(List<? super Animals> animalsList) {
        System.out.println("super Animals");
        for (Object animals : animalsList) {
//            animals.eat();
            System.out.println(animals.hashCode());
        }
    }


}
