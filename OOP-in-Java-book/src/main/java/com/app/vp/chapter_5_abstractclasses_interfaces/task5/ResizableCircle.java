package com.app.vp.chapter_5_abstractclasses_interfaces.task5;

public class ResizableCircle extends Circle implements Resizable{

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        if(percent <= 0){
            throw new IllegalArgumentException("Resize percent must be positive.");
        }
        this.radius *= percent;
    }

    @Override
    public String toString() {
        return "ResizableCircle{" +
                "radius=" + radius +"}; " + super.toString();
    }
}
