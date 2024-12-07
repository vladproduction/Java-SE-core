package com.vladproduction.tasks;

public class TaskIsIntegersSame02 {
    public static void main(String[] args) {
        Integer i1 = 1234;
        Integer i2 = 1234;
        if (i1 != i2) System.out.println("different objects");
        if (i1.equals(i2)) System.out.println("meaningfully equal");
    }
}
