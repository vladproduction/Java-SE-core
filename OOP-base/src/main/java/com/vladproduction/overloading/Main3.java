package com.vladproduction.overloading;

/**
 * This example describes two methods named doJob(), with reference parameters of String and Object.
 * When the methods are called, they are passed a reference to a string, which is defined by the types String and Object.
 * Therefore, in this case, the argument and parameter types are exactly matched.
 * When overloading for reference types, the type of the object, not the object type, is decisive.
 * */
public class Main3 {
    static void doJob(String s) { System.out.println("String"); }
    static void doJob(Object o) { System.out.println("Object"); }

    public static void main(String[] args) {
        String str = "abcd";
        Object obj = str;
        doJob(str);
        doJob(obj);

        //output:
        /*String
          Object*/
    }
}
