package com.vladproduction.app35.java_parameter_passing;

import java.util.ArrayList;
import java.util.List;

public class ParamPassingObject {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        System.out.println("Fruits before calling method: " + fruits);//[apple, banana, orange]

        //processData(fruits);
        System.out.println("Fruits after calling method1: " + fruits);//[apple, banana, orange, grapes]

        processData2(fruits);
        System.out.println("Fruits after calling method2: " + fruits);//[apple, banana, orange]

    }

    private static void processData(List<String> fruitsRef) {
        fruitsRef.add("grapes");
    }

    //but if we create a new List inside this method:
    private static void processData2(List<String> fruitsRef) {
        fruitsRef = new ArrayList<>(fruitsRef);
        fruitsRef.add("peach");
        //no changes occur because a new object was created
    }
}
