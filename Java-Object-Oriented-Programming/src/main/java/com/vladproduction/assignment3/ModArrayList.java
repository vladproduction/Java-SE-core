package com.vladproduction.assignment3;

import java.util.ArrayList;

/**
 * ModArrayList is a custom implementation of an ArrayList that allows for
 * retrieval of an element at a modified index. The modified index can be
 * negative, and it will handle such cases correctly.
 *
 * @param <D> The type of elements in this ModArrayList.
 */
public class ModArrayList<D> extends ArrayList<D> { //subclass could store any referenced data type

    /**
     * Retrieves an element from the list at a modified index.
     * If the index is negative, it will convert it to a positive index
     * using the modulus operator, ensuring that it remains within the
     * bounds of the current size of the list.
     *
     * @param index The index of the element to retrieve.
     * @return The element at the modified index.
     */
    public D getModIndex(int index){
        int validIndex = Math.abs(index) % this.size(); //Math.abs - for making index positive
        return this.get(validIndex); // Return the element at the valid index
    }

}
