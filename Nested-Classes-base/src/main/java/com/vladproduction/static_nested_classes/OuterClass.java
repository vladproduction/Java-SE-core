package com.vladproduction.static_nested_classes;

public class OuterClass {
    private int x = 7;
    static class CustomStatic {
        private int x = 8;
        public void seeOuter() {
            System.out.println(" x is " + x);
        }
    }

    public static void main(String[] args) {
        CustomStatic objStatic = new CustomStatic();
        objStatic.seeOuter();
    }
}
