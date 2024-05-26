package com.app.vp.chapter_7_collections.collection_rules;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Autoboxing_Unboxing {
    public static void main(String[] args) {

        Integer intObj_1 = 1; //autoboxing
        int intPrimitive = intObj_1; //unboxing
        System.out.println("intPrimitive = " + intPrimitive);

        Double doubleObj_2 = 23.55;
        double d = doubleObj_2;
        System.out.println("d = " + d);

        System.out.println("---------------------------");
        List<Integer> integerList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i <= 10; i++) {
            integerList.add(random.nextInt(10));
        }
        System.out.println(integerList);
        System.out.println("---------Iterator:------------");
        //for each:
        System.out.println("//for each:");
        for (Integer integer : integerList) {
            System.out.print(integer + " ");
        }
        //get elements (auto-unboxing):
        System.out.println("\n//get elements (auto-unboxing):");
        for (int i = 0; i < integerList.size(); i++) {
            Integer integer = integerList.get(i);
            System.out.print(integer + " ");
        }

    }
}
