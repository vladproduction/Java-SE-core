package com.vladproduction.vp42_equals_String;

/**
 * Created by vladproduction on 18-Mar-24
 */

public class CompareNotWorkByDoubleEquals {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello123".substring(0, 5); //the last element is not include

        System.out.println(b);
        System.out.println(a == b);

        /*  hello
            false*/

        //here is two different objects:
        /**Comparison (a == b): The == operator compares object references. In this case, a might refer
         * to a String object from the pool (if it already existed), while b always refers to a new String object
         * created from the substring operation.
         * Since these are distinct objects in memory, the comparison returns false.*/

        //achieve string comparison based on content, use the equals() method:


        System.out.println(a.equals(b)); // print true


    }
}
