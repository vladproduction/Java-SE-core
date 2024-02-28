package com.vladproduction.anonymous_classes.demo2;

public class Main02 {
    public static void main(String[] args) {
        Shape circle = new Shape(){
            @Override
            public void draw() {
                System.out.println("Drawing a circle...");
            }
        };
        circle.draw(); //Drawing a circle...
    }
}
