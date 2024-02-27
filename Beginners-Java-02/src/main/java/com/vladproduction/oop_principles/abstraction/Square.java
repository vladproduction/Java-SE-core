package com.vladproduction.oop_principles.abstraction;


class Square extends Rectangle {

    // Concrete class implementing specific details for a square

    public Square(int side) {
        super.setDimensions(side, side); // Calling inherited method
    }

    // Overriding the abstract method with concrete calculation for square
    @Override
    public double getArea() {
        return width * width;
    }
}