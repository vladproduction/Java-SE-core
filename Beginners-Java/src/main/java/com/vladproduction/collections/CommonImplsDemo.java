package com.vladproduction.collections;

import java.util.*;

public class CommonImplsDemo {
    public static void main(String[] args) {
        //ArrayList: Dynamic array implementation, fast for random access.
        ArrayList<String> list = new ArrayList<>();
        list.add("Item1");
        list.add("Item2");
        list.add("Item3");
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.indexOf("Item1"));

        //LinkedList: Doubly-linked list implementation, efficient for insertions/deletions.
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("Item1");
        linkedList.addLast("Item2");
        linkedList.addFirst("Item3");
        System.out.println(linkedList.size());
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        //HashSet: Uses hash table, offers constant-time performance.
        HashSet<String> set = new HashSet<>();
        set.add("Element1");
        set.add("Element2");
        set.add("Element3");
        System.out.println(set.size());
        System.out.println(set.contains("Element1"));
        System.out.println(set.stream().findFirst());

        //TreeSet: Sorted set based on tree structure.
        TreeSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(5);
        sortedSet.add(2);
        System.out.println(sortedSet.first()); // 2
        System.out.println(sortedSet.last()); // 5

        //LinkedHashSet: Maintains insertion order.
        LinkedHashSet<String> orderedSet = new LinkedHashSet<>();
        orderedSet.add("First");
        orderedSet.add("Second");
        // Iterates in insertion order
        for (String s : orderedSet) {
            System.out.print(s + " ");
        }
        System.out.println("\n\tstream:");
        orderedSet.stream().sorted().forEach(System.out::println);

        System.out.println("\n\tMap:");
        //HashMap: General-purpose implementation with constant-time operations.
        Map<String, Integer> map = new HashMap<>();
        map.put("Third", 300);
        map.put("Second", 200);
        map.put("First", 100);
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " " + stringIntegerEntry.getValue());
        }
        System.out.println("\n\tValues of this map:");
        for (Integer value : map.values()) {
            System.out.println(value);
        }
        System.out.println("\n\tkeySet of this map:");
        for (String s : map.keySet()) {
            System.out.println(s + " " + map.get(s));
        }

        System.out.println("\n\tTreeMap: natural order");
        //TreeMap: Keys sorted in natural order.
        TreeMap<String, Integer> sortedMap = new TreeMap<>();
        sortedMap.put("b", 2);
        sortedMap.put("a", 1);
        System.out.println(sortedMap.firstKey()); // "a"
        System.out.println(sortedMap.lastKey());
        System.out.println(sortedMap.lowerKey("a"));
        System.out.println(sortedMap.floorKey("a"));

        //LinkedHashMap: Maintains insertion order of keys.
        LinkedHashMap<String, Integer> orderedMap = new LinkedHashMap<>();
        orderedMap.put("first", 1);
        orderedMap.put("second", 2);
        orderedMap.put("third", 3);
        // Iterates in insertion order
        for (String s : orderedMap.keySet()) {
            System.out.println(s + " " + orderedMap.get(s));
        }






    }
}
