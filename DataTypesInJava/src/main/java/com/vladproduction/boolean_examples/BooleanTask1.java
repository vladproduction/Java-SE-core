package com.vladproduction.boolean_examples;

/**
 * #1
 * Suppose that a and b are boolean variables. Show that the expression
 * (!(a && b) && (a || b)) || ((a && b) || !(a || b))
 * evaluates to true.
 * */
public class BooleanTask1 {
    public static void main(String[] args) {

        //version-1
        System.out.println("version-1");
        boolean a = true;
        boolean b = true;
        if((!(a && b) && (a || b)) || ((a && b) || !(a || b))){
            System.out.println("evaluates to true");
        }else {
            System.out.println("evaluates to false");
        }

        //version-2 (all cases to check)
        System.out.println("version-2 (all cases to check)");
        boolean[] values = {true, false}; //possible values for a and b
        for (boolean valA : values) {
            for (boolean valB : values) {
                boolean result = (!(valA && valB) && (valA || valB)) || ((valA && valB) || !(valA || valB));
                System.out.println("valA: " + valA + ", valB: " + valB + " => evaluates to " + result);
            }
        }
    }
}
