package com.vladproduction.boolean_examples;

public class ShortCircuit {

    static boolean test1(int val) {
        System.out.println("test1(" + val + ")");
        System.out.println("result: " + (val < 1));
        return val < 1;
    }
    static boolean test2(int val) {
        System.out.println("test2(" + val + ")");
        System.out.println("result: " + (val < 2));
        return val < 2;
    }
    static boolean test3(int val) {
        System.out.println("test3(" + val + ")");
        System.out.println("result: " + (val < 3));
        return val < 3;
    }
    public static void main(String[] args) {
        if(test1(0) && test2(2) && test3(2))
            System.out.println("expression is true");
        else
            System.out.println("expression is false");
    }

    /*  The first test returns true, so the expression continues to be evaluated.
        However, the second test returns false. Since this means that the entire expression
        must be false, why continue evaluating the rest of the expression? It would be too
        expensive. The justification for short-circuiting is, in fact, precisely this; you can
        get a potential performance boost by not having to evaluate all the parts of the logical expression.*/
}
