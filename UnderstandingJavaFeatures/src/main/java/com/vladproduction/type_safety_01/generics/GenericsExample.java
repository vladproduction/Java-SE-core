package com.vladproduction.type_safety_01.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Raw Type Warning: The rawList demonstrates the potential pitfalls of using raw types.
 * It allows adding both String and Integer, but casting to String later can lead to a ClassCastException.
 *
 * Type Safety Advantage: Using generics helps avoid such issues and ensures type safety at compile time.
 * */
public class GenericsExample {

    private static final Logger log = Logger.getLogger(String.valueOf(GenericsExample.class));

    //generic method to display list
    public static <T> void displayList(List<T> list) {
        for (T t : list) {
            System.out.println(t);
        }
    }

    //will cause a runtime issue if items are not of the expected type
    public static void displayRawList(List list) {
        try {
            for (Object object : list) {
                String s = (String) object;
                System.out.println(s);
            }
        } catch (ClassCastException e) {
            log.severe("ClassCastException: Object refer into TypeClass invalid");
        }
    }

    public static void main(String[] args) {
        //generic list
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("Generics");
        displayList(stringList);

        //raw list (not recommended)
        List rawList = new ArrayList(); // raw type
        rawList.add("String");
        rawList.add(10); // This compiles, but it can lead to issues
        displayRawList(rawList); // Unsafe cast can cause ClassCastException at runtime
    }
}
