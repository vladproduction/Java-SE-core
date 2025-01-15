package com.vladproduction._07_functional_programming.visitor_pattern;

interface Shape {
    void accept(Visitor visitor); // Accepts a visitor
}
