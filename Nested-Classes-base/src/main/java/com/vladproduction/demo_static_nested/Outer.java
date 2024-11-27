package com.vladproduction.demo_static_nested;

public class Outer {
    private static int x = 10;
    public void makeStatic() {
        Nested obSt = new Nested();
        obSt.seeOuter();
    }
    static class Nested {
        public void seeOuter() {
            System.out.println("Outer x is " + x);
        }
    }
    public static void main(String[] args) {
        new Outer().makeStatic();
    }
}