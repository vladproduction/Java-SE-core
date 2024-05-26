package com.app.vp.chapter_6_generics;

import java.util.List;

/**
 * List<? extends T> (Wildcard Extends):
 * Represents a list that can hold elements of type T or any subtype of T.
 * Think of it as a producer (provides elements).
 * */
public class Tester2_Wildcard_Extends {
    public static void main(String[] args) {

    }

    class Animal{

    }

    class Cage<T extends Animal> { // Cage for Animals or their subtypes
        private List<? extends Animal> animals; // List of Animals or subtypes

        public void addAnimal(T animal) { // Can add only the specific cage type (T)
            // Cannot add elements to List<? extends T> because of unknown subtype
        }

        public Animal getRandomAnimal() {
            int randomIndex = (int) (Math.random() * animals.size());
            return animals.get(randomIndex);  // Read element as Animal or subtype
        }
    }
}
