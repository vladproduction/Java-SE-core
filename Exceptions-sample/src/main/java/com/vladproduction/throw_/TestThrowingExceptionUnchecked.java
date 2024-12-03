package com.vladproduction.throw_;

public class TestThrowingExceptionUnchecked {
    public static void main(String[] args) {
        try {
            testExcp();
        } catch(RuntimeException e) { //we catch exception in catch block
            System.out.println(e.getMessage());
        }
    }
    public static void testExcp() {
        throw new RuntimeException("test");
    }
}


