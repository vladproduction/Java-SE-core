package com.app.vp.chapter_5_abstractclasses_interfaces.task3;

public class MovablePoint implements Movable {

    private int x, y;

    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveUp() {
        y--;
    }

    @Override
    public void moveDown() {
        y++;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    @Override
    public String toString() {
        return "( " + x + ", " + y + " )";
    }
}
