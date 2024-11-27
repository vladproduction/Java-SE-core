package com.vladproduction.demo_outer;

public class Outer {
    private String x = "Outer";

    void doStuff() {
        class Inner {
            public void seeOuter() {
                System.out.println("Outer x is " + x);
            }
        }
        Inner mi = new Inner();
        mi.seeOuter();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.doStuff();//Outer x is Outer
    }
}