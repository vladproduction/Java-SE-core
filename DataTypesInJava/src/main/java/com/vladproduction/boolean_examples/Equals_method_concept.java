package com.vladproduction.boolean_examples;

/**
 * the equals() method is used to compare two objects for equality.
 * This method is defined in the Object class, and by default, it checks for reference equality
 * (i.e., whether the two references point to the same object in memory).
 * To compare the contents or state of two objects of a class, needs to override the equals() method.
 * */
public class Equals_method_concept {
    public static void main(String[] args) {

        Value value1 = new Value(10);
        Value value2 = new Value(10);
        Value value3 = new Value(20);

        // Demonstrating equals() method
        System.out.println("value1.equals(value2): " + value1.equals(value2)); // true
        System.out.println("value1.equals(value3): " + value1.equals(value3)); // false

    }

    static class Value{
        int i;

        //constructor to initialize the value
        public Value(int i) {
            this.i = i;
        }

        //override equals() method
        @Override
        public boolean equals(Object object){
            // check if the object is the same reference
            if(this == object){
                return true;
            }

            // Check if the object is an instance of Value
            if(object instanceof Value){
                Value other = (Value) object;
                // Compare the values of the two objects
                return this.i == other.i;
            }

            // If obj is not an instance of Value, return false
            return false;
        }

        // Override hashCode when equals is overridden
        @Override
        public int hashCode(){
            return Integer.hashCode(i);
        }

    }
}

