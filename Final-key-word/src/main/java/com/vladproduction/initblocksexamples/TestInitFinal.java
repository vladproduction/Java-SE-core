package com.vladproduction.initblocksexamples;

public class TestInitFinal {
    final byte n = 1; //has to be initialized because it is final and it is not static so we access by instance
    static final byte n2 = 10; //static - for class
    public static void main(String[] args) {
        final byte b;

        {
            b = 10;
        }
        System.out.println(b); //10

        //and if we want to have access there two ways
//        1)instance access (create instance of the class and call this through '.'
        System.out.println(new TestInitFinal().n);

//        2)making variable 'n' as static (class access)
        System.out.println(n2);

        //output:
//        10
//        1
//        10

    }
}
