package com.vladproduction.interfaces;
/**
 * This example describes the Shape interface with one abstract method getSquare() and a field PI.
 * This interface is implemented by the Circle class, in which the getSquare() method is overridden – it gets a body.
 * In the MainShapeCircleApp class, a reference to the Shape interface is created, and it is initialized with
 * an object of the Circle class (this is a polymorphic use of interfaces), on which the getSquare() method is called.
 * */
public class MainShapeCircleApp {public static void main(String[] args) {
    Shape object = new Circle(7.01);
    System.out.print("Square:" + object.getSquare());
    //Square:154.37817715666776
}
}
