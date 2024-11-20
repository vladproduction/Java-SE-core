package com.vladproduction.super_keyword;

public class Base {
    private int a, b;
    Base(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return a + " " + b;
    }
}
