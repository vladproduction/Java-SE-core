package com.vladproduction.app22.exception_handling.simple_examples;

import com.sun.jdi.InvalidTypeException;

public class HandlingUnknowingExceptions {
    public static void main(String[] args) {

        try{
            Integer.parseInt("Hello");                                      //throws NumberFormatException
        }catch (NumberFormatException e){
            System.out.println("NumberFormatException caught");
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException caught");
        }catch (Exception e){                                                   // Catches any other exception
            System.out.println("Exception caught");
        }
        finally {
            System.out.println("Finally block: will always be executed");
        }

        try{
            int x = 10 / 0;                                                     // This will throw ArithmeticException
        }catch (Exception e){                                                   //Catch all exceptions
            System.out.println("Exception occurred: " + e.getMessage());
        }

    }
}
