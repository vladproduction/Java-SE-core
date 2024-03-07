package com.vladproduction.vp33_generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vladproduction on 07-Mar-24
 */

public class Main33 {
    public static void main(String[] args) {

        //-----------Java 5------------------
        List list = new ArrayList();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add(4);
        list.add(5);

        String two = (String) list.get(1);
        int four = (int) list.get(3);
        System.out.println(two);
        System.out.println(four);

        System.out.println("---<Generic>---");
        //-----------<Generic>----------------
        List<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("bird");

        String dog = animals.get(1);
        System.out.println(dog);




    }
}
