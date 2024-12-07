package com.vladproduction.creating;

public class WaysCreating {
    public static void main(String[] args) {
        //Constructor with corresponding primitive type
        Integer intObject1 = 100;
        Double doubleObject1 = 0.01;

        //valueOf() with a primitive type
        Integer intObject3 = Integer.valueOf(11);
        Double doubleObject3 = Double.valueOf(11.1);

        //valueOf() with a string describing the value of a primitive type
        Integer intObject4 = Integer.valueOf("11");
        Double doubleObject4 = Double.valueOf("11.1");

        //Features of creating a Boolean class object
        Boolean b = true;
        Boolean b1 = false;
        Boolean b2 = Boolean.valueOf("no true");
        Boolean b3 = Boolean.TRUE;
        System.out.println(b + ", " + b1 + ", " + b2 + ", " + b3); //true, false, false, true
    }
}
