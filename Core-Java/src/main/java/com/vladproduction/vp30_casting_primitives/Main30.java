package com.vladproduction.vp30_casting_primitives;

/**
 * Created by vladproduction on 07-Mar-24
 */

public class Main30 {
    public static void main(String[] args) {

        byte byte1 = 10;            //1 byte = 8 bit     -127 128
        short short1 = 10;          //2 byte = 16 bit
        int int1 = 10;              //4 bytes = 32 bit
        long long1 = 10;            //8 byte = 64 bit
        float float1 = 10.0f;       //4 bytes (32 bits)
        double double1 = 10.0;      //8 byte = 64 bit
        boolean boolean1 = true;    //or false
        char char1 = 'c';           //2 bytes (16 bits)

        //-----------------------------------
        //if we want to cast one to another:
        long l1 = 123123123123L; //to much for int but it`s ok for long

        int a = 123;
        long l = a; //implicit type cast
        int x = (int) l; //explicit type cast
        System.out.println(a);

        //-----------------------------------
        float f = 123.3F; //we can past F at the end of value; or we can cast: (float) before value;
        float f1 = (float) 123.3;

        //---int to double--------------------------------
        int aa = 123;
        double xx = aa;
        System.out.println("xx = " + xx);
        //but vise versa it`s could be only by casting
        //---double to int--------------------------------
        double vv = 123.6;
        int dd = (int)vv;
        System.out.println("dd = " + dd); // here we loose 0.6

        //we can use Math.round()-------------------
        long vv_round = Math.round(vv);
        System.out.println("vv_round = " + vv_round); //here 0.6 were round to 1.0






    }
}
