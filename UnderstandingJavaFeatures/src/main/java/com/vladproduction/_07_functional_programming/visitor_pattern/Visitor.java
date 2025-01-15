package com.vladproduction._07_functional_programming.visitor_pattern;

interface Visitor {
    void visit(Circle circle);    // Visit method for Circle
    void visit(Rectangle rectangle); // Visit method for Rectangle
}
