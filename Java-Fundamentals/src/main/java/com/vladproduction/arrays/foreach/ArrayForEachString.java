package com.vladproduction.arrays.foreach;

public class ArrayForEachString {
    public static void main(String[] args) {

        //String is immutable type, so for each loop does not available for modifying elements of array of Strings
        String[] strings = {"Java", "Docker", "Spring"};
        for (String string : strings) {
            System.out.print(string + " ");
        }
        System.out.println();

        //try to modify arr by for each loop (add some information as 11 for each element):
        for (String string : strings) {
            string += 11; //does not affect to the original arr
        }

        //it possible to affect the original array by for array loop:
        for (int i = 0; i < strings.length; i++) {
            strings[i] += "-11;";
        }

        //print arr by for each:
        for (String string : strings) {
            System.out.print(string + " "); // printing the original array: Java Docker Spring
                                            // and after modification:      Java-11; Docker-11; Spring-11;
        }
        System.out.println();

    }
}
