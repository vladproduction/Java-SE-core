package com.vladproduction.testing_tasks;

public class MainTask01 {
    public static void main(String[] args) {
        int a = 10;
        String name = null;
        try {
            int length = name.length();
            a = length;
            a++;
        }  catch (RuntimeException e) {
            ++a;
        }
        System.out.println(a); //11
    }
}
