package com.vladproduction.vp29_polymorphism;

class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a square");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a triangle");
    }
}

public class Demo {
    public static void main(String[] args) {
        Shape shapeRef;  // Reference variable of type Shape

        shapeRef = new Circle();  // Assign a Circle object
        shapeRef.draw();  // Calls Circle's draw() method (polymorphism)

        shapeRef = new Square();  // Assign a Square object
        shapeRef.draw();  // Calls Square's draw() method (polymorphism)

        shapeRef = new Triangle();  // Assign a Triangle object
        shapeRef.draw();  // Calls Triangle's draw() method (polymorphism)
    }
}
