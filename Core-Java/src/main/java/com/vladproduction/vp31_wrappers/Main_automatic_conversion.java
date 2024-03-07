package com.vladproduction.vp31_wrappers;

/**
 * Created by vladproduction on 07-Mar-24
 */

public class Main_automatic_conversion {
    public static void main(String[] args) {

        //Autoboxing:
        int num = 10;
        Integer numObject = num; // Autoboxing: `num` (primitive int) is converted to `numObject` (Integer object)

        //-----------------------------------------------------------------------------
        //Auto-unboxing:
        Integer numObject1 = 20;
        int num1 = numObject1; // Auto-unboxing: `numObject1` (Integer object) is converted to `num1` (primitive int)

        //-----------------------------------------------------------------------------
        boolean bFalse = Boolean.FALSE;
        Boolean b = false;
    }
}
