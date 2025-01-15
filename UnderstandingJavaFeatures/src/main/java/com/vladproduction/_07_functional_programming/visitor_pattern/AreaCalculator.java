package com.vladproduction._07_functional_programming.visitor_pattern;

class AreaCalculator implements Visitor {
    private double totalArea = 0;

    @Override
    public void visit(Circle circle) {
        // Sample calculation for Circle with radius 1
        double radius = 1; // Hardcoded for simplicity
        totalArea += Math.PI * radius * radius; // Area = πr²
    }

    @Override
    public void visit(Rectangle rectangle) {
        // Sample calculation for Rectangle with width 2 and height 3
        double width = 2; // Hardcoded for simplicity
        double height = 3; // Hardcoded for simplicity
        totalArea += width * height; // Area = width * height
    }

    public double getTotalArea() {
        return totalArea;
    }
}
