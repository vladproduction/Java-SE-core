package com.vladproduction.vp42_equals_String;

/**
 * Created by vladproduction on 18-Mar-24
 */

public class CompareString {
    public static void main(String[] args) {

        /**String is referenced type of data*/
        String string1 = "Hello"; // goes to pool-->
        String string2 = "Hello"; // automatic java understand that we have same objects (by values) in memory
        //so by '==' is going to be 'true'
        //it help java to save memory, resources and time

        System.out.println(string1.equals(string2)); //true

        //compare references in pool
        System.out.println(string1 == string2); //true

        System.out.println("--------------");
        //---------------------
        //but if we create our String through 'new'
        String strA = new String("Hello");
        String strB = new String("Hello");
        // '==' does not(!!!) work references are different, and they are saved not in pool
        System.out.println(strA == strB); //false

        //check if we use equals();
        System.out.println(strA.equals(strB)); //true -> compare by content





    }
}
