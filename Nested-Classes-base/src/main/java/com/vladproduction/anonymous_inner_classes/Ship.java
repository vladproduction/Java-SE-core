package com.vladproduction.anonymous_inner_classes;

/**
 * - description of a local variable y of type final
 * - creation of a reference tst of type CustomTest
 * - calling the test() method on this reference.
 * The tst reference is initialized by an interface object for which an anonymous class is declared that implements the test() method.
 * In addition, the anonymous class describes its own field z and a dynamic initialization block.
 * The test() method demonstrates access to the private field x of the Ship class and the local variable y of the doJob() method,
 * despite the fact that it is a method of an anonymous class, which, in turn, is part of an expression for creating an object
 * in one of the methods of another class.
 * */
public class Ship {
    private int x = 10;
    void doJob() {
        final int y = 20;
        CustomTest tst = new CustomTest() {
            private int z = 10;
            {
                System.out.print("Init block");
            }
            public void test() {
                System.out.print(x + " " + z + " " + y);
            }
        };
        tst.test();
    }
    public static void main(String[] args) {
        Ship ship = new Ship();
        ship.doJob(); //Init block10 10 20
    }
}
interface CustomTest {
    void test();
}