package com.app.vp.chapter_7_collections.organize_sort_search;

import java.util.*;

/**
 * In addition to the Comparable interface (or natural comparison), we can pass a Comparator object to sort methods
 * (Collections.sort() or Arrays.sort()) to ensure precision control when comparing;
 * The Comparator interface will override Comparable;
 * Comparator assigned method int compare(T o1, T o2){
 *     return    -1 (o1 < o2)
         *     or 0 (o1 == o2)
         *     or 1 (o1 > o2)
 * }
 * */
public class Comparator_compare {
    public static void main(String[] args) {

        //for strings:
        Comparator<String> stringComparator = new StringComparator();//init class that compare by specific logic
        String[] array = {"Hey", "Hello", "hello", "Hi"}; //create data
        Arrays.sort(array, stringComparator); //sorting
        System.out.println("array = " + Arrays.toString(array)); //print

        //trying binary search:
        System.out.println(Arrays.binarySearch(array, "Hi", stringComparator));
        //not case-sensitive
        System.out.println(Arrays.binarySearch(array, "HI", stringComparator));


        System.out.println("---------------");
        //for integer:
        Comparator<Integer> integerComparator = new IntegerComparator();
        Comparator<Integer> integerComparator2 = new IntegerComparator2();
        List<Integer> list = new ArrayList<>();
        list.add(42);
        list.add(21);
        list.add(34);
        list.add(13);

//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);

        Collections.sort(list, integerComparator);
        System.out.println("list = " + list);

        //binarySearch:
        System.out.println(Collections.binarySearch(list, 22, integerComparator));//1
        //1: This line searches for the element 22 in the sorted list using Collections.binarySearch.
        // The integerComparator is passed as the third argument to ensure the search considers the LSD sorting.
        // Since 22 falls between 21 and 34 (with the same LSD as 21), it's found at index 1, and 1 is printed.

        System.out.println(Collections.binarySearch(list, 35, integerComparator)); //-5
        //-5: This line searches for the non-existent element 35.
        // Collections.binarySearch returns a negative value indicating the insertion point. Here, the insertion
        // point would be between 34 and the imaginary element greater than 34 (which would be 35 in this case).
        // The calculated insertion point is 2, so the returned value is - (insertion point) - 1 = - (2) - 1 = -5.


    }

    //defining a class that can organize strings that are not case-sensitive
    public static class StringComparator implements Comparator<String>{
        @Override
        public int compare(String o1, String o2) {
            return o1.compareToIgnoreCase(o2);
        }
    }

    //defining a class that can organize integers based on least significant digit
    public static class IntegerComparator implements Comparator<Integer>{
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 % 10 - o2 % 10;//calculates the remainder (least significant digit) of dividing o1 and o2 by 10

//            -If the result is positive (o1's LSD is greater than o2's LSD),
//            it means o1 should come after o2 in the sorted list, so 1 is returned.
//            -If the result is negative (o1's LSD is less than o2's LSD),
//            it means o1 should come before o2, so -1 is returned.
//            -If the result is zero (both integers have the same LSD), the sorting should proceed by comparing
//            the remaining digits (more significant digits). However, since Collections.sort is typically a stable
//            sorting algorithm, the original order of elements with the same LSD will be preserved.
        }
    }

    //one more variant to compare logic:
    public static class IntegerComparator2 implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            // Check if the least significant digits are the same
            if (o1 % 10 == o2 % 10) {
                // If they are the same, elements remain in their original order
                // (stable sorting behavior)
                return 0;
            } else {
                // Otherwise, sort based on the least significant digit
                return o1 % 10 - o2 % 10;
            }
        }
//        Explanation:
//
//        -Compare LSD First:
//        The compare method first checks if the least significant digits (LSD) of o1 and o2 are the same
//        using o1 % 10 == o2 % 10.
//
//        -Stable Sorting for Same LSD:
//        If the LSDs are the same, it means both integers are at the same "stage" in the sorting process based on
//        their least significant digits.
//        To maintain the original order of elements with the same LSD (stable sorting behavior), 0 is returned.
//        This allows the sorting algorithm (e.g., Collections.sort which typically uses mergesort) to preserve
//        the order it encountered these elements.
//
//        -Sort by LSD otherwise:
//        If the LSDs are different, the sorting proceeds as before. The difference between the remainders
//        (o1 % 10 - o2 % 10) determines the order:
    //        Positive result: o1 comes after o2 (o1's LSD is greater).
    //        Negative result: o1 comes before o2 (o1's LSD is less).
    }


}
