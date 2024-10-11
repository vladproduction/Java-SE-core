package com.vladproduction.polymorphism;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * compile-time example;
 * more than one method with the same name;
 * */
public class Main4 {
    public static void main(String[] args) {

        Predicate<Integer> isDividedByTwo = n -> Math.abs(n) % 2 == 0;
        Predicate<Integer> isDividedByThree = n -> Math.abs(n) % 3 == 0;

        ConditionArrayListMulti dividedByTwoList = new ConditionArrayListMulti(isDividedByTwo);
        dividedByTwoList.add(1);
        dividedByTwoList.add(2);
        dividedByTwoList.add(3);
        dividedByTwoList.add(4);
        dividedByTwoList.add(5);
        System.out.println(dividedByTwoList);

        ConditionArrayListMulti dividedByTwoList2 = new ConditionArrayListMulti(isDividedByTwo, 1,2,3,4,5);
        System.out.println(dividedByTwoList2);

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);

        ConditionArrayListMulti arrayListMulti = new ConditionArrayListMulti(isDividedByTwo, integers);
        System.out.println(arrayListMulti);

        //test with another predicate (isDividedByThree):
        ConditionArrayListMulti arrayListMulti_dividedByThree = new ConditionArrayListMulti(isDividedByThree, integers);
        System.out.println(arrayListMulti_dividedByThree);



    }
}
