package com.vladproduction.polymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

/**
 * The OddArrayList class extends ArrayList<Integer> and is designed to
 * store only odd integers. It overrides several methods from the
 * superclass to enforce this constraint.
 * <p>
 * This class is a demonstration of runtime polymorphism, where method
 * overriding allows the subclass to change the behavior of the methods
 * inherited from the ArrayList class.
 */
public class OddArrayList extends ArrayList<Integer> {

    //expecting to hold only odd nums, so generic define as Integer;
    //and also we are have to modify some methods from superclass (ArrayList);

    /**
     * Constructor that accepts a variable number of Integer arguments.
     * It filters the input to include only odd numbers before
     * initializing the ArrayList with those values.
     *
     * @param numbers The integers to be added to the OddArrayList.
     */
    public OddArrayList(Integer... numbers) {
        super(Arrays.stream(numbers)
                .filter(OddArrayList::isOdd)
                .collect(Collectors.toList()));
    }

    /**
     * Overrides the add method to add an element at the specified index
     * only if it is odd.
     *
     * @param index   The index at which the specified element is to be inserted.
     * @param element The element to be inserted.
     */
    @Override
    public void add(int index, Integer element) {
        if (isOdd(element)) {
            super.add(index, element);
        }
    }

    /**
     * Overrides the add method to add an element only if it is odd.
     *
     * @param element The element to be added.
     * @return true if the element was added successfully, false otherwise.
     */
    @Override
    public boolean add(Integer element) {
        if (isOdd(element)) {
            return super.add(element);
        } else {
            return false;
        }
    }

    /**
     * Overrides the addAll method to add a collection of elements,
     * filtering out even numbers.
     *
     * @param c Collection of integers to be added.
     * @return true if this collection changed as a result of the call.
     */
    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return super.addAll(c.stream()
                .filter(OddArrayList::isOdd)
                .toList());
    }

    /**
     * Overrides the addAll method to add a collection at the specified
     * position, filtering out even numbers.
     *
     * @param index The index at which to insert the first element from the specified collection.
     * @param c     Collection of integers to be added.
     * @return true if this collection changed as a result of the call.
     */
    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
        return super.addAll(index, c.stream()
                .filter(OddArrayList::isOdd)
                .toList());
    }

    /**
     * Overrides the set method to replace the element at the specified index
     * with the specified element only if the element is odd.
     *
     * @param index   The index of the element to replace.
     * @param element The new element.
     * @return The element previously at the specified position.
     */
    @Override
    public Integer set(int index, Integer element) {
        if (isOdd(element)) {
            return super.set(index, element);
        } else {
            System.out.println(element + " is not odd.");
            return Integer.MIN_VALUE;
        }
    }

    /**
     * replaceAll is immediately remove all invalid elements
     */
    @Override
    public void replaceAll(UnaryOperator<Integer> operator) {
        super.replaceAll(operator);
        super.removeIf(element -> !isOdd(element));
    }

    /**
     * custom function to check if element is odd number
     */
    public static boolean isOdd(Integer element) {
        return Math.abs(element) % 2 == 1;
    }

}









