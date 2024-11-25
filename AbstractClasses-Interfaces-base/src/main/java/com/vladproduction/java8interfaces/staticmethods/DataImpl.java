package com.vladproduction.java8interfaces.staticmethods;

/**
 * Let's consider an example in which:
 * We will describe the Data interface with a static method isNull() and a default method print().
 * We will describe the DataImpl class, which implements the Data interface, and define its isNull() method in it.
 * The isNull() methods of both the class and the interface contain message output code,
 * but it is different - this is done in order to track which method is executed in which case.
 * In the main() method, we will create an instance of the DataImpl class and call the print() and isNull() methods on it.
 * As a result: when the default print() method is executed, we observe that the static Data interface is called,
 * and not the isNull() method of the DataImpl class. Only when the isNull() method is called through a reference to an object,
 * the DataImpl class's own method is already executed.
 * */
public class DataImpl implements Data { // implementing interface Data
    public boolean isNull(String str) {
        System.out.println("Null check");
        return str == null;
    }
    public static void main(String[] args) {
        DataImpl obj = new DataImpl();
        obj.print("");
        obj.isNull("abc");
        /*Checking if the string is null or empty.
        Null check*/
    }
}
interface Data {
    default void print(String str){
        if( !isNull(str) ){
            System.out.println("Data class. Printing lines: " + str);
        }
    }
    static boolean isNull(String string){
        System.out.println("Checking if the string is null or empty.");
        if (string == null) {
            return true;
        }
        return string.trim().isEmpty();
    }
}