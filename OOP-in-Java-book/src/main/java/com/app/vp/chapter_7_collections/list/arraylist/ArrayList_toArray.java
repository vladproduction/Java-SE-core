package com.app.vp.chapter_7_collections.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Superinterface define method toArray() for creating arrays based on current array;
 * returned array [] possible to modify;
 * */
public class ArrayList_toArray {
    public static void main(String[] args) {

        //defining the data:
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        //version for Object:
        Object[] intArray = list.toArray();
        System.out.println("intArray = " + Arrays.toString(intArray));

        //version for Generic:
        Integer[] intArray2 = list.toArray(new Integer[3]);
        System.out.println("intArray2 = " + Arrays.toString(intArray2));
        intArray2[2] = 30; //modifying element
        //printing to see changes:
        System.out.println("intArray2 = " + Arrays.toString(intArray2));

        //but we did not change the first variant:
        System.out.println("intArray = " + Arrays.toString(intArray));

    }


}
