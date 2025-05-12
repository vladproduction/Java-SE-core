package com.vladproduction.app05.polymorphism;

public class StaticPolymorphism {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        // Calling the overloaded methods
        System.out.println("Int calculation: " + calculator.calculate(5)); // Calls method with int param
        System.out.println("Double calculation: " + calculator.calculate(5.0)); // Calls method with double param
        System.out.println("Sum of two ints: " + calculator.calculate(4, 3)); // Calls method with two int params
        System.out.println("Sum of two String: " + calculator.calculate("4", "3")); // Calls method with two String params
        System.out.println("Sum of two doubles: " + calculator.calculate(4.5, 3.5)); // Calls method with two double params
    }


    static class Calculator{

        //overload (static polymorphism)
        public String calculate(String a, String b){
            return a + b; // returns a String
        }

        // Method with two int parameters
        public int calculate(int x, int y) {
            return x + y; // returns an int
        }

        // Method with two double parameters
        public double calculate(double x, double y) {
            return x + y; // returns a double
        }

        // Method with one int parameter
        public int calculate(int x) {
            return x * 2; // returns an int
        }

        // Method with one double parameter
        public double calculate(double x) {
            return x * 2.5; // returns a double
        }

    }


}
