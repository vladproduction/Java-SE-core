package com.vladproduction.outer_inner_classes;

/**
 * The Ship class represents a maritime vessel with an inner class Engine.
 *
 * Key Features:
 * - Contains a private variable `x`, representing a state of the ship.
 * - The Engine inner class can directly access and modify `x`.
 * - Demonstrates the relationship between outer and inner classes in Java
 *   through the testing() method, which creates an Engine instance to call
 *   its test() method.
 */
class Ship { //outer
    private int x = 10;
    protected class Engine { //inner
        public void test() {
            x = 20; // access to the outer class field directly
            x++;
            System.out.println(x);
        }
    }
    public void testing() { // outer class method
        Engine eng = new Ship.Engine();
        eng.test(); // calling method of inner class by using instance of the inner class
    }
    public static void main(String[] args) {
        Ship ship = new Ship();
        ship.testing(); // 21

        Ship.Engine engine = ship.new Engine();
        engine.test(); // 21
    }
}