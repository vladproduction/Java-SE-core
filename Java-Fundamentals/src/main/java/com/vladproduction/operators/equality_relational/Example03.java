package com.vladproduction.operators.equality_relational;

public class Example03 {
    public static void main(String[] args) {
        float result = 1 / 3.f * 3.f;
        System.out.println(1.f == result); //true
        System.out.println(1.00000001f == 1.00000002f); //true
        System.out.println(1.000001f == 1.000002f); //false (machine zero in action for float)

    }
}
