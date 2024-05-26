package com.app.vp.chapter_4_polymorphism.drawable_task;

public class DrawableMain {
    public static void main(String[] args) {

        Drawable [] shapes = new Drawable[2];
        shapes[0] = new Circle();
        shapes[1] = new Square();
        for (Drawable shape : shapes) {
            shape.draw();
        }

    }
}
