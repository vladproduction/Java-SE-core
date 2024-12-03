package com.vladproduction.throw_;

public class TestThrowingException {
    public static void main(String[] args) {
        try {
            testExcp();
        } catch(Exception exp) {
            System.out.println(exp.getMessage());
        }
    }
    public static void testExcp() throws Exception {
        throw new Exception("test"); //Unhandled exception: java.lang.Exception; need to add to method signature
    }
}
