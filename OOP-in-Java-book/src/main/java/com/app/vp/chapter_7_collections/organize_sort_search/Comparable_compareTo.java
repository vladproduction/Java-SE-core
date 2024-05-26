package com.app.vp.chapter_7_collections.organize_sort_search;

import java.util.*;

/**
 * Arrays.sort() methods and Collections.sort() to sort an array of strings and a list of integers;
 * -Integer values based on default interface Comparable;
 * -Comparable for String compares two strings based on their Unicode codes, i.e. capital letters (from the top
 *  case) less than similar small letters (from lowercase register).
 * */
public class Comparable_compareTo {
    public static void main(String[] args) {

        String[] array = {"Hey", "Hello", "hello", "Hi"};
        Arrays.sort(array);
        System.out.println("array = " + Arrays.toString(array));

        //trying binary search (array should be sorted)
        System.out.println(Arrays.binarySearch(array, "Hello"));

        //trying to search non-existing element:
        System.out.println(Arrays.binarySearch(array, "HELLO"));

        List<Integer> integerList = new ArrayList<>();
        integerList.add(22);
        integerList.add(77);
        integerList.add(11);
        integerList.add(55);
        //sort this list first:
        Collections.sort(integerList);
        //printing
        System.out.println("integerList = " + integerList);
        System.out.println(Collections.binarySearch(integerList, 77)); //expected: 3 (index)
        //trying to search non-existing element:
        /*
        * To indicate this insertion point, Collections.binarySearch returns -(insertion point) - 1.
        * In this scenario, the insertion point would be 4 (after 77), so the returned value is - (4) - 1 = -5.
        * Helps determine the appropriate position to insert the missing element while maintaining the sorted order.
        * */
        System.out.println(Collections.binarySearch(integerList, 100)); //expected: -5


    }
}
