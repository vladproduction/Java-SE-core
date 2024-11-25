package com.vladproduction.abstractclasses;

/**
 * The abstract superclass GraphicObject with two fields x and y, an abstract method for drawing a shape draw()
 * and a method for moving a shape with the implementation moveTo() are described.
 * Next, its subclass Circle is described, which provides an empty implementation of the draw() method.
 * Therefore, the class is not abstract and its objects can be created. In the MainGraphicObjectApp class,
 * a reference of type GraphicObject is created, which is initialized with an object of type Circle.
 * The draw() method is called on this object. Everything works correctly.
 * */
public class MainGraphicObjectApp {
    public static void main(String[] args) {
        GraphicObject mng;
        //mng = new GraphicObject(); //can not create an object of abstract class

        mng = new Circle ();
        mng.draw();
        mng.moveTo(10, 10);
    }
}
