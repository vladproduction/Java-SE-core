package com.app.vp.chapter_7_collections.list.linkedlist;

import java.util.LinkedList;

/**
 * LinkedList is a doubly linked list implementation for the List<E> interface that works efficiently both for insertion
 * elements and for deleting;
 * Also implements the Queue<E> and Deque<E> interfaces and can work from both ends of the queue.
 * It can work with queues both according to the FIFO principle and the LIFO principle;
 * */
public class LinkedList_impl {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("E");

        //print elements of the linkedList:
        System.out.println("linkedList = " + linkedList);

        //remove elements:
        linkedList.remove("D"); //by object
        linkedList.remove(0); //by index
        System.out.println("linkedList after remove = " + linkedList);

        //remove first and last elements:
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("linkedList after remove (first and last) = " + linkedList);
        Object object = linkedList.get(0);
        linkedList.set(0, object + " - updated");
        System.out.println("linkedList after updated = " + linkedList);



    }
}
