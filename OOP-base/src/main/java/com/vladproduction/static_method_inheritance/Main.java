package com.vladproduction.static_method_inheritance;

public class Main {
    public static void main(String[] args) {

        // Calling the static method on the superclass reference
        SuperClass.staticMethod();

        // Calling the static method on the subclass reference
        SubClass.staticMethod();

        // Demonstrating method hiding with superclass reference type
        SuperClass superRef = new SubClass();
        superRef.staticMethod();

        //output:
        /*Super Class static method
        Sub Class static method
        Super Class static method*/
    }
}

//NOTE:
//Why This is Not LSP?

/*1) Static Methods: Static methods do not participate in polymorphism in Java.
When you call a static method, the method is resolved at compile time based on the reference type, not the object type.
This is why superRef.staticMethod() calls the method from SuperClass rather than SubClass.*/

/*2)Principle Violation: If the behavior of SuperClass and SubClass results in different outcomes based on which class
the reference type belongs to (which is the case here with static methods),
it can indicate a violation of LSP. In a properly designed subclass that adheres to LSP, you would expect that using a SubClass instance
instead of a SuperClass instance wouldn’t change the expected behavior.*/
