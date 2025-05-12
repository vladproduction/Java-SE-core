package com.vladproduction.app26.print_elem_odd_even_indexes;

public class PrintElementsOddEvenIndexes {
    public static void main(String[] args) {

        //String elements in an array:
        String[] stringArray = {"Java", "Spring", "UnitTest", "Docker", "Hibernate", "Jenkins", "Postman", "Selenium"};
        printFromStringEvenOdd(stringArray);

        //int elements in an array:
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printFromIntegerEvenOdd(intArray);

    }

    private static void printFromStringEvenOdd(String[] stringArray) {
        System.out.println("\nEven index elements:");
        for (int i = 1; i < stringArray.length; i+=2) {
            System.out.print(stringArray[i] + " ");
        }
        System.out.println("\nOdd index elements:");
        for (int i = 0; i < stringArray.length; i+=2) {
            System.out.print(stringArray[i] + " ");
        }
    }

    private static void printFromIntegerEvenOdd(int[] intArray) {
        System.out.println("\nEven index elements:"); //2,4,6,8...
        for (int i = 1; i < intArray.length; i+=2) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println("\nOdd index elements:"); //1,3,5...
        for (int i = 0; i < intArray.length; i+=2) {
            System.out.print(intArray[i] + " ");
        }

    }
}




















