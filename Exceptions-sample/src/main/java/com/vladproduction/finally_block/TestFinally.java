package com.vladproduction.finally_block;

/**
 * This example describes two methods, procA() and procB(), which are called from the main() method.
 * In the procA() method, the try block, to which the finally block is attached, uses the return statement.
 * Therefore, before returning from the method, the body of the completion block is executed.
 * In the procB() method, the try block, to which the finally block is also attached, uses the return statement with a parameter.
 * Therefore, before returning from the method, the body of the completion block is executed,
 * which also uses the return statement with a different parameter value.
 * As a result, the procB() method returns the value specified in the completion handler.
 * */
public class TestFinally {
    static void procA() {
        try {
            System.out.println("Method procA()");
            return;
        } finally {
            System.out.println("Block finally< /span> of method procA()");
        }
    }
    static int procB() {
        try {
            System.out.println("Method procB()");
            return 1;
        } finally { //Before the method exits, the finally block will be executed.
            System.out.println("Block finally< /span> of method procB()");
            return 0;
        }
    }
    public static void main(String [] args) {
        procA();
        System.out.println( procB() );
        //output:
        /*Method procA()
        Block finally< /span> of method procA()
        Method procB()
        Block finally< /span> of method procB()
        0*/
    }
}