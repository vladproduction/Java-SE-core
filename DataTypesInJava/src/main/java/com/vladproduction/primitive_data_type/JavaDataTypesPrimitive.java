package com.vladproduction.primitive_data_type;

public class JavaDataTypesPrimitive {
    public static void main(String[] args) {

        System.out.println("Java data types");
        System.out.println();
        System.out.println("\tJava data types primitive:");
        int i = 0 , j = 100;
        System.out.println("i = " + i + "; j = " + j);
        System.out.println("increment i, and decrement j: ");
        i++;
        j--;
        System.out.println(i);
        System.out.println(j);
        System.out.println("operator: i + j (concatenation)");
        System.out.println("res = " + i + j);
        System.out.println("as integer:");
        System.out.println(i + j);
        System.out.println("as integer other side:");
        System.out.println(j + i); //100
        System.out.println(j - i); //98

    }
}
