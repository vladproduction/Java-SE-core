package com.vladproduction.overloading;

/**
 * This example describes two methods named doJob():
 *  - the first with two reference types of Object
 *  - the second with the first parameter of type String and the second with a variable arity of type Object.
 * When calling a method with two arguments of type String, the method with two parameters of type Object will be executed (definition in step 2).
 * When calling a method with arguments of type Object and String, the method with two parameters of type Object will be executed (definition in step 2).
 * And only when calling a method with three arguments of type String, the method with the variable arity parameter of type Object
 * will be executed (definition in step 4).
 * */
public class Main7 {
    static void doJob(Object obj1, Object obj2) {
        System.out.println("Object, Object ");
    }
    static void doJob(String str, Object... oo) {
        System.out.println("String, Object...");
    }
    public static void main(String[] args) {
        doJob("hi", "hi");
        doJob(new Object(), "hi" );
        doJob("hi", "hi", "hi");

        //output:
        /*Object, Object
        Object, Object
        String, Object...*/
    }
}
