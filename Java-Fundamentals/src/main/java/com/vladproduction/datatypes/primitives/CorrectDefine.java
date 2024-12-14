package com.vladproduction.datatypes.primitives;

public class CorrectDefine {
    public static void main(String[] args) {
        //Double, double
        double d1 = 0.0f;
        Double d2 = new Double(.0f);
//        Double d3 = 0.0f;
//        Double d4 = new Double("1L");
        Double d5 = 0.d;
//        Double d6 = 1L;

        //Integer, int
        int i1 = Integer.parseInt("14");
        Integer i2 = 85;
//        int i3 = Integer.decode('12');
        int i4 = Integer.valueOf("21");
//        int i5 = Integer.valueOf(null);
        int i6 = new Integer("15");

        //which will compile?
//        System.out.println(new Integer(null));
//        System.out.println(new String(null));
        System.out.println(new String("null"));
//        System.out.println((char[])null);
        System.out.println((true?null:0));
        System.out.println((String)null);

        //what to expect of output:
        Byte b = new Byte("3");  // line 1
        System.out.println(b.floatValue() + " " + b.getClass().getName());  // line 2
        //3.0 java.lang.Byte

        //what to expect for output:
        Double ddd = Double.POSITIVE_INFINITY;
        double ddd1 = ddd.intValue() + Double.NEGATIVE_INFINITY;
        System.out.println(ddd1);
        //-Infinity



    }
}
