package com.vladproduction.finalmethod;

public class finalMethod {
    public static void main(String[] args) {

    }

    static class Parent {
        final void display() {
            System.out.println("Parent's display method");
        }
    }

    static class Child extends Parent {
        // Cannot override a final method
        // void display() { } // Error
    }

}
