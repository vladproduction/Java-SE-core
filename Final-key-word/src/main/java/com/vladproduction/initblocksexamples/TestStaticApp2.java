package com.vladproduction.initblocksexamples;

/**
 * Example demonstrates the concept of static variables and blocks in Java.
 * The use of a static block for initialization allows the class variable i to be set when the class is loaded
 */
public class TestStaticApp2 {
    static int i;

    // Instance initializer block
    {
        i = 5; // Assigns the value 5 to 'i' whenever an instance of the class is created
    }
    public static void main(String[] args) {
        System.out.println(i); //can access because it is class variable;
        //but so far we did not create an instance, so output is: 0

        //scenario we got a '5'
        TestStaticApp2 obj = new TestStaticApp2(); // Creating an instance
        System.out.println(i); // Now 'i' will 5

        //output:
        /*  0
            5   */
    }
}
