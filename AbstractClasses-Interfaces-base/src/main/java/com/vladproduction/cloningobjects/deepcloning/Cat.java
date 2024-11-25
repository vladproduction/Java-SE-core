package com.vladproduction.cloningobjects.deepcloning;

public class Cat implements Cloneable{

    private int age;
    private String name;
    private Color color; // Mutable object

    public Cat(int age, String name, Color color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // Deep cloning: clone the mutable Color object
        Cat clonedCat = (Cat) super.clone();
        clonedCat.color = (Color) this.color.clone(); // Deep clone the color

        return clonedCat;
    }

    public String toString() {
        return "Age = " + age + ", Name = " + name + ", Color = " + color;
    }

}
