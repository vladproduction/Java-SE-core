package com.vladproduction.datatypes.literals;

/**
 * snippet illustrates various concepts related to String handling in Java,
 * particularly concerning String literals, object creation, reference assignments,
 * and comparison methods.*/
public class StringReferencesManipulation02 {
    public static void main(String[] args) {

        System.out.println("============");
        String name = "name";                       // String literal, stored in String Pool
        String name2 = new String("name");          // New String object created in heap memory

        System.out.println(name == name2);          // false: name refers to String Pool object, name2 refers to a separate object in heap
        System.out.println(name.equals(name2));     // true: both String objects contain the same content

        String name3 = name2;                       // name3 refers to the same object as name2
        System.out.println(name == name3);          // false: name refers to String Pool, name3 refers to heap object
        System.out.println(name.equals(name3));     // true: both contain the same content

        System.out.println("===========");
        System.out.println(name.equals(new String("name"))); // true: content comparison with a new String object

        String name4 = new String("name");          // New String object created in heap memory
        System.out.println(name == name4);          // false: different object references

        System.out.println("===== reassign reference ======");
        name = name4;                              // name now points to the same object as name4
        System.out.println(name == name4);         // true: both references point to the same heap object

    }
}
