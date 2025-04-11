package com.vladproduction.exceptions;

public class UncheckedExceptionsDemo {
    public static void main(String[] args) {
        int [] arr = new int [5];

        try {
            System.out.println(arr[10]); // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }
    }
}
