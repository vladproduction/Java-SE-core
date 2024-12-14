package com.vladproduction.arrays.foreach;

/**
 * concept:
 * if object of reference type is mutable, behaviour of this object could be changed;
 * after applying method for modifications (append) with object that refer to the original object from array,
 * will be change the original object as well;
 * */
public class ArrayForEachStringBuilder {
    public static void main(String[] args) {

        // StringBuilder is mutable type,
        // so for each loop is available for modifying elements of array of type StringBuilder
        StringBuilder[]  stringBuilders = new StringBuilder[3];
        stringBuilders[0] = new StringBuilder("Java");
        stringBuilders[1] = new StringBuilder("Oracle");
        stringBuilders[2] = new StringBuilder("Spring");

        //print original:
        System.out.println("Original:");
        for (StringBuilder stringBuilder : stringBuilders) {
            System.out.print(stringBuilder + " ");
        }
        System.out.println();
        /*Original:
        Java Oracle Spring*/

        //try to modify array of type StringBuilder
        //modifying each StringBuilder object in the array by appending "-11
        for (StringBuilder stringBuilder : stringBuilders) {
            stringBuilder.append("-11"); // standard method for StringBuilder object
        }
        System.out.println();

        //print after modifying:
        System.out.println("Modified:");
        for (StringBuilder stringBuilder : stringBuilders) {
            System.out.print(stringBuilder + " ");
        }
        System.out.println();
        /*Modified:
        Java-11 Oracle-11 Spring-11*/

    }
}
