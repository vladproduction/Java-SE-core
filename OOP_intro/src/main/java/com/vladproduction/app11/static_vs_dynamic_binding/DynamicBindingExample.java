package com.vladproduction.app11.static_vs_dynamic_binding;

public class DynamicBindingExample {
    public static void main(String[] args) {

        Animal animal = new Dog(); // Upcasting
        animal.sound();            // Resolved at runtime (Dog's version: 'Dog barks')

    }

    static class Animal {
        public void sound() {
            System.out.println("Some generic animal sound");
        }
    }

    static class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("Dog barks");
        }
    }


}
