package com.vladproduction.collections_comparing;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CompareSetsPerformance {

    //variables to store performance summary
    private static long hashSetAddTime;
    private static long treeSetAddTime;
    private static long linkedHashSetAddTime;
    private static long hashSetRemoveTime;
    private static long treeSetRemoveTime;
    private static long linkedHashSetRemoveTime;
    private static long hashSetContainsTime;
    private static long treeSetContainsTime;
    private static long linkedHashSetContainsTime;

    public static void main(String[] args) {

        // Test adding performance
        testAddPerformance();

        // Test removal performance
        testRemovalPerformance();

        // Test contains performance
        testContainsPerformance();

        // Summary of results
        printSummary();

    }

    private static void testAddPerformance() {
        Set<String> hashSet = new HashSet<>();
        hashSetAddTime = timingAddOperation(hashSet);
        System.out.println("HashSet add time: " + hashSetAddTime + " ns");

        Set<String> treeSet = new TreeSet<>();
        treeSetAddTime = timingAddOperation(treeSet);
        System.out.println("TreeSet add time: " + treeSetAddTime + " ns");

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSetAddTime = timingAddOperation(linkedHashSet);
        System.out.println("LinkedHashSet add time: " + linkedHashSetAddTime + " ns");
    }

    private static long timingAddOperation(Set<String> set) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            set.add(String.valueOf(i)); // Add elements to the set
        }
        long endTime = System.nanoTime();
        return endTime - startTime; // Return elapsed time in nanoseconds
    }

    private static void testRemovalPerformance() {
        // Create and populate sets for removal testing
        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();

        for (int i = 0; i < 10000; i++) {
            hashSet.add(String.valueOf(i));
            treeSet.add(String.valueOf(i));
            linkedHashSet.add(String.valueOf(i));
        }

        hashSetRemoveTime = timingRemovalOperation(hashSet);
        System.out.println("HashSet remove time: " + hashSetRemoveTime + " ns");

        treeSetRemoveTime = timingRemovalOperation(treeSet);
        System.out.println("TreeSet remove time: " + treeSetRemoveTime + " ns");

        linkedHashSetRemoveTime = timingRemovalOperation(linkedHashSet);
        System.out.println("LinkedHashSet remove time: " + linkedHashSetRemoveTime + " ns");
    }

    private static long timingRemovalOperation(Set<String> set) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            set.remove(String.valueOf(i)); // Remove elements from the set
        }
        long endTime = System.nanoTime();
        return endTime - startTime; // Return elapsed time in nanoseconds
    }

    private static void testContainsPerformance() {
        // Create and populate sets for contains testing
        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();

        for (int i = 0; i < 10000; i++) {
            hashSet.add(String.valueOf(i));
            treeSet.add(String.valueOf(i));
            linkedHashSet.add(String.valueOf(i));
        }

        hashSetContainsTime = timingContainsOperation(hashSet);
        System.out.println("HashSet contains time: " + hashSetContainsTime + " ns");

        treeSetContainsTime = timingContainsOperation(treeSet);
        System.out.println("TreeSet contains time: " + treeSetContainsTime + " ns");

        linkedHashSetContainsTime = timingContainsOperation(linkedHashSet);
        System.out.println("LinkedHashSet contains time: " + linkedHashSetContainsTime + " ns");
    }

    private static long timingContainsOperation(Set<String> set) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            set.contains(String.valueOf(i + 5000)); // Check if elements exist in the set
        }
        long endTime = System.nanoTime();
        return endTime - startTime; // Return elapsed time in nanoseconds
    }

    private static void printSummary() {
        System.out.println("\nPerformance Summary:");
        System.out.println("HashSet Add Time: " + hashSetAddTime + " ns");
        System.out.println("TreeSet Add Time: " + treeSetAddTime + " ns");
        System.out.println("LinkedHashSet Add Time: " + linkedHashSetAddTime + " ns");
        System.out.println("HashSet Remove Time: " + hashSetRemoveTime + " ns");
        System.out.println("TreeSet Remove Time: " + treeSetRemoveTime + " ns");
        System.out.println("LinkedHashSet Remove Time: " + linkedHashSetRemoveTime + " ns");
        System.out.println("HashSet Contains Time: " + hashSetContainsTime + " ns");
        System.out.println("TreeSet Contains Time: " + treeSetContainsTime + " ns");
        System.out.println("LinkedHashSet Contains Time: " + linkedHashSetContainsTime + " ns");
    }

}
