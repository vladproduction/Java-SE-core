package com.vladproduction.try_catch_demo;

public class MainNestedBlocks {
    public static void main(String[] args) {

    }
    public void method_1() {
        // …
        try {method_2(); }
        catch(RuntimeException exp) {
            // …
        }
    }
    public void method_2() {
        try { // …
        } catch (ArithmeticException exp) {
            // …
        }
    }
}
