package com.vladproduction.polymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

/**
 * The ConditionArrayList class extends ArrayList<Integer> to create a
 * list that allows elements to be added only if they meet a specified
 * condition defined by a Predicate<Integer>.
 * This allows the creation of a customized list with flexible conditions
 * for adding elements while still leveraging the functionality of
 * ArrayList.
 */
public class ConditionArrayList extends ArrayList<Integer> {

    private Predicate<Integer> condition; // Holds the condition for eligibility of elements

    /**
     * Constructor that initializes the ConditionArrayList with an array
     * of integers. It filters the input based on the provided predicate
     * to include only eligible numbers.
     *
     * @param predicate A Predicate that defines the condition for adding
     *                  elements.
     * @param numbers   An array of Integer numbers to be added to the list.
     */
    public ConditionArrayList(Predicate<Integer> predicate, Integer... numbers) {
        super(Arrays.stream(numbers)
                .filter(predicate) // Filter numbers based on the predicate condition
                .collect(Collectors.toList()));
        this.condition = predicate;
    }

    /**
     * Overrides the add method to insert an element at the specified index
     * only if it meets the specified condition.
     *
     * @param index   The index at which the specified element is to be
     *                inserted.
     * @param element The element to be inserted.
     */
    @Override
    public void add(int index, Integer element) {
        if (isEligible(element)) {
            super.add(index, element);
        }
    }

    /**
     * Overrides the add method to add an element only if it meets the
     * specified condition.
     *
     * @param element The element to be added.
     * @return true if the element was added successfully, false otherwise.
     */
    @Override
    public boolean add(Integer element) {
        if (isEligible(element)) {
            return super.add(element);
        } else {
            return false;
        }
    }

    /**
     * Overrides the addAll method to add a collection of elements, filtering
     * to include only those that meet the specified condition.
     *
     * @param c Collection of integers to be added.
     * @return true if the list changed as a result of the call.
     */
    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return super.addAll(c.stream()
                .filter(this::isEligible)
                .toList());
    }

    /**
     * Overrides the addAll method to add a collection starting at a specified
     * index, filtering to include only those that meet the specified
     * condition.
     *
     * @param index The index at which to insert the first element from the
     *              specified collection.
     * @param c Collection of integers to be added.
     * @return true if the list changed as a result of the call.
     */
    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
        return super.addAll(index, c.stream()
                .filter(this::isEligible)
                .toList());
    }

    /**
     * Overrides the set method to replace the element at the specified index
     * only if the new element meets the specified condition.
     *
     * @param index   The index of the element to replace.
     * @param element The new element to be set.
     * @return The element previously at the specified position.
     */
    @Override
    public Integer set(int index, Integer element) {
        if (isEligible(element)) {
            return super.set(index, element);
        } else {
            System.out.println(element + " is not odd.");
            return Integer.MIN_VALUE;
        }
    }

    /**
     * Overrides the replaceAll method to apply a UnaryOperator function to
     * all elements in the list. After applying the operator, any elements
     * that do not meet the specified condition are removed from the list.
     *
     * @param operator A UnaryOperator to apply to each element in the list.
     */
    @Override
    public void replaceAll(UnaryOperator<Integer> operator) {
        super.replaceAll(operator);
        super.removeIf(element -> !isEligible(element));
    }

    /**
     * Checks whether a given integer is eligible to be added to the list
     * based on the specified condition. This method is not static, allowing
     * it to use the instance variable 'condition' for determining eligibility.
     *
     * @param element The integer to check for eligibility.
     * @return true if the element meets the condition, false otherwise.
     */
    public boolean isEligible(Integer element) { //not static, using by instance variable
        return condition.test(element);
    }

}









