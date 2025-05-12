package com.vladproduction.app22.exception_handling.simple_examples;

public class DemonstrationFinally {
    public static void main(String[] args) {

        try {
            int[] array = {1,2,3};
            System.out.println(array[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught");
        } finally {
            System.out.println("Finally block: will always be executed");
        }

    }
}
