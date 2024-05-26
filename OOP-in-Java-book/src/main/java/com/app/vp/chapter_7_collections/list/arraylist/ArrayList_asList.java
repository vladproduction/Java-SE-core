package com.app.vp.chapter_7_collections.list.arraylist;

import java.util.Arrays;
import java.util.List;

/**
 * Class Arrays offers a static method Arrays.asList() to represent an array as a List<T>.
 * Should keep in mind that the method assumes a list representation,
 * rather than converting to a list, so changes should be made
 * in the entry to be represented as an array.
 * */
public class ArrayList_asList {
    public static void main(String[] args) {

        String[] strings = {"string1", "string2", "string3"};
        System.out.println("strings = " + Arrays.toString(strings)); //print array

        List<String> stringList = Arrays.asList(strings);
        System.out.println("stringList = " + stringList); //print content of list

        //do changes to array(strings) and list(stringList):
        strings[0] += "5"; //change array
        stringList.set(1, stringList.get(1) + "5");
        System.out.println("strings = " + Arrays.toString(strings)); //print array
        System.out.println("stringList = " + stringList); //print content of list





    }
}
