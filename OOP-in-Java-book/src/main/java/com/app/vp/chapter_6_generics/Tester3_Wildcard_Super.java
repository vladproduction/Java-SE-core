package com.app.vp.chapter_6_generics;

import java.util.List;

/**
 * List<? super T> (Wildcard Super):
 * Represents a list that can hold elements of type T or any supertype of T.
 * Think of it as a consumer (accepts elements).
 * */
public class Tester3_Wildcard_Super {
    public static void main(String[] args) {

    }

    class Food{

    }

    class Feeder {
        private List<? super Food> feeders; // List of Food or supertypes

        public void addFood(Food food) { // Can add any type of Food or supertype
            feeders.add(food);
        }

        public void removeEatenFood() { // Can remove elements but cannot use them directly
            feeders.remove(0); // Can remove but don't know the type to use
        }
    }

}
