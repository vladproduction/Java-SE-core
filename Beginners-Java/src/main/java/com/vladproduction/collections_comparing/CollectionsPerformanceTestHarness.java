package com.vladproduction.collections_comparing;

/**
 * runs all the comparison tests sequentially and provides formatted output
 * */
public class CollectionsPerformanceTestHarness {

    public static void main(String[] args) {
        System.out.println("=== Starting Java Collections Performance Tests ===\n");

        // Test 1: ArrayList vs LinkedList
        System.out.println("Test 1: ArrayList vs LinkedList");
        System.out.println("--------------------------------");
        CompareArrayLinkedListsSummary.main(args);
        System.out.println();

        // Test 2: HashSet vs TreeSet vs LinkedHashSet
        System.out.println("Test 2: HashSet vs TreeSet vs LinkedHashSet");
        System.out.println("----------------------------------------");
        CompareSetsPerformance.main(args);
        System.out.println();

        // Test 3: ArrayDeque vs LinkedList
        System.out.println("Test 3: ArrayDeque vs LinkedList");
        System.out.println("-------------------------------");
        CompareDequeListPerformance.main(args);
        System.out.println();

        // Test 4: PriorityQueue vs ArrayList vs LinkedList
        System.out.println("Test 4: PriorityQueue vs ArrayList vs LinkedList");
        System.out.println("--------------------------------------------");
        ComparePriorityQueuePerformance.main(args);
        System.out.println();

        // Test 5: HashMap vs TreeMap vs LinkedHashMap
        System.out.println("Test 5: HashMap vs TreeMap vs LinkedHashMap");
        System.out.println("----------------------------------------");
        CompareMapsPerformance.main(args);
        System.out.println();

        // Test 6: Stack vs ArrayDeque
        System.out.println("Test 6: Stack vs ArrayDeque");
        System.out.println("-------------------------");
        CompareStackDequePerformance.main(args);
        System.out.println();

        // Test 7: ConcurrentHashMap vs CopyOnWriteArrayList
        System.out.println("Test 7: ConcurrentHashMap vs CopyOnWriteArrayList");
        System.out.println("----------------------------------------------");
        CompareConcurrentCollectionsPerformance.main(args);
        System.out.println();

        // Test 8: Vector vs ArrayList vs LinkedList vs CopyOnWriteArrayList
        System.out.println("Test 8: Vector vs Other Lists");
        System.out.println("----------------------------");
        CompareVectorWithOtherListsPerformance.main(args);

        System.out.println("\n=== Java Collections Performance Tests Completed ===");
    }

}
