package com.app.vp.chapter_6_generics;

import java.util.Collections;
import java.util.List;

public class CovariantMain {
    public static void main(String[] args) {

        List<String> names = List.of("Alice", "Bob", "Charlie");
        CovariantMain covariantMain = new CovariantMain();
        covariantMain. processList(Collections.singletonList(names)); // Pass List<String> to processList (works)

    }

    public void processList(List<Object> objects) {
        // The method receives a List<Object> argument
        for (Object obj : objects) {
            // You can only treat elements as Object inside the method
            // (cannot use methods specific to String without casting)
            System.out.println(obj);
        }
    }

    /*While you can pass a subtype list to a supertype list argument, be cautious when working with the elements inside the method.
    You can't use methods specific to the subtype (e.g., String methods) without casting.
    This approach promotes code reusability as the method can work with various list types as long as the elements are
    ultimately objects.*/
}
