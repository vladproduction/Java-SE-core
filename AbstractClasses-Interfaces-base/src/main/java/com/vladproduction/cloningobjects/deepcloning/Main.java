package com.vladproduction.cloningobjects.deepcloning;

public class Main {
    public static void main(String[] args) throws Exception{

        Color catColor = new Color("Brown");
        Cat cat = new Cat(5, "Chita", catColor);
        Cat copyCat = (Cat) cat.clone();

        System.out.println(copyCat);

        // check hashCodes (different as expected):
        System.out.println(cat.hashCode()); // Original cat hashCode
        System.out.println(copyCat.hashCode()); // Copy cat hashCode

        // check == (if they are refer to the same memory place)
        System.out.println(cat == copyCat); // false

        // check them by equals()
        System.out.println(cat.equals(copyCat)); // false
        System.out.println(copyCat.equals(cat)); // false

        // Change color of the original cat and see if it affects the copy
        catColor = new Color("Black");
        System.out.println("After changing color of original cat:");
        System.out.println(cat); // Original cat (should remain Brown)
        System.out.println(copyCat); // Cloned cat (should still be Brown)

        //output:
        /*Age = 5, Name = Chita, Color = Brown
        2129789493
        668386784
        false
        false
        false
        After changing color of original cat:
        Age = 5, Name = Chita, Color = Brown
        Age = 5, Name = Chita, Color = Brown*/

    }
}
