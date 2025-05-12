package com.vladproduction.app11.static_vs_dynamic_binding;

/**
 * Resolved at compile time
 * Happens with:
 *      Private, final, and static methods
 *      Overloaded methods (compile-time polymorphism)
 * */
public class StaticBindingExample {
    public static void main(String[] args) {

        StaticBindingExample obj = new StaticBindingExample();
        obj.display(5);               // resolved at compile time
        obj.display("Hello");         // resolved at compile time
        StaticBindingExample.printMessage(); // resolved at compile time

    }

    public static void printMessage(){
        System.out.println("Static method: Static Binding");
    }

    public void display(int x) { // overloaded method
        System.out.println("Display int: " + x);
    }

    public void display(String s) {
        System.out.println("Display string: " + s);
    }

}
