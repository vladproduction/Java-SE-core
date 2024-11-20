package com.vladproduction.early_binding;

/**
 * The call to a static method depends on the class type specified in the call,
 * not on the type of the object or the reference type.
 * In this case, CarInsurance.getCategory() will always call the method defined
 * in the CarInsurance class, regardless of any instance.
 *
 * Conversely, when calling an instance method like current.getCategory(),
 * the method that will be executed depends on the runtime type of the object
 * that current references (which is CarInsurance here), not the type of the reference
 * (Insurance).
 */
public class Main {
    public static void main(String[] args) {
        Insurance current = new CarInsurance();

        //Late Binding (Dynamic Binding) relates specifically to instance methods
        // and involves runtime resolution based on the actual object's type.
        System.out.println("category: " + current.getCategory());

        //Early Binding (Static Binding) refers to static methods (and also overloading) where the method to be called
        // is determined at compile time based on the reference type
        System.out.println("category: " + CarInsurance.getCategory());

        //output:
        /*category: Insurance
        category: CarInsurance*/
    }
}
