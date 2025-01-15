package com.vladproduction._07_functional_programming.facory_pattern;

/**
 * The Factory Pattern leverages polymorphism by returning different types of objects that share a common interface.
 * This allows for the creation of families of related objects without specifying their concrete classes, enhancing type safety and flexibility.
 * */
class ShapeFactory {
    public Shape createShape(String shapeType) {
        switch (shapeType.toLowerCase()) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            default:
                throw new IllegalArgumentException("Unknown shape type");
        }
    }
}
