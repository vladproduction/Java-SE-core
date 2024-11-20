package com.vladproduction.super_keyword;

public class Derived extends Base {
    private int c;

    Derived(int a, int b, int c) {
        super(a, b); //have to be invokes first
        this.c = c;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + c +")"; //for printing parent toString have to be invokes first as well
    }
}
