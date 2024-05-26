package com.app.vp.chapter_5_abstractclasses_interfaces.task4;

import com.app.vp.chapter_5_abstractclasses_interfaces.task3.Movable;

public class MovablePointMain {
    public static void main(String[] args) {

        Movable m1 = new MovablePoint(5,5,1, 1);
        System.out.println("m1 = " + m1);
        m1.moveLeft();
        System.out.println("m1 = " + m1);

        Movable m2 = new MovableCircle(2, 1, 2, 20, 10);
        System.out.println("m2 = " + m2);
        m2.moveRight();
        System.out.println("m2 = " + m2);

    }
}
