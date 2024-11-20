package com.vladproduction.lsp_adherence;

/**
 * Circle extends Shape and properly overrides the area() method.
 * Any instance of Circle can be used wherever a Shape instance is expected, and it will exhibit the expected behavior defined by the superclass.
 * */
public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle(5);
        System.out.println("Area: " + shape.area()); // Outputs the area of the circle
        //Area: 78.53981633974483
    }
}

/*
Conclusion
Method hiding does not adhere to LSP because it doesn't provide the expected polymorphic behavior of subclasses.
Instead, it is important to ensure that subclasses correctly extend the functionality of superclasses
while abiding by LSP, making sure their behavior is consistent when substituted.*/
