package com.vladproduction.cloningobjects.shallowcloning;

/**
 * The clone() method is marked as protected and cannot be called explicitly outside the class.
 * For the cloning mechanism to work correctly, it is necessary to override the clone() method and call super.clone() inside its implementation.
 *
 * To override the clone() method of the Object class and specify that the class implements the Cloneable interface marker give us:
 * The clone() method of the Object class already implements one type of cloning — superficial (copies of fields are created),
 * which is why it is called (super.clone()). As a result, we will get a copy of the original object.
 *
 * The cloning in this example is effectively a shallow copy.
 * This is because while super.clone() creates a new Cat instance, it does not create new instances of any mutable objects that may be referenced.
 * If the Cat class contained fields that were mutable objects, those would need to be cloned individually in the overridden clone() method to achieve deep cloning.
 * */
public class Main {
    public static void main(String[] arg) throws Exception {
        Cat cat = new Cat(5, "Chita");
        Cat copyCat = (Cat) cat.clone();
        System.out.println(copyCat);

        //check hashCodes (different as expected):
        System.out.println(cat.hashCode()); //81628611
        System.out.println(copyCat.hashCode()); //1828972342

        //check == (if they are refer to the same memory place)
        System.out.println(cat == copyCat); //false

        //check them by equals()
        System.out.println(cat.equals(copyCat)); //false
        System.out.println(copyCat.equals(cat)); //false
    }
}
