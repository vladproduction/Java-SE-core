package com.vladproduction._07_functional_programming.visitor_pattern;

class Rectangle implements Shape {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this); // Accept the visitor
    }
}
