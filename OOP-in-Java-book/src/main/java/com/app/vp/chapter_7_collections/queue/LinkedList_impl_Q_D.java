package com.app.vp.chapter_7_collections.queue;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

/**
 * the LinkedList<E> class also implements the Queue<E> and Deque<E> interfaces in addition to the List<E> interface,
 * providing a queue or deque as a "doubly linked list" data structure;
 * */
public class LinkedList_impl_Q_D {
    public static void main(String[] args) {

        //add elements to the queue by offer() method; true or false;
        Queue<Day> myQueue = new LinkedList();
        myQueue.offer(Day.MON);
        myQueue.offer(Day.WED);
        boolean flag_success = myQueue.offer(Day.FRI);
        System.out.println("is FRIDAY added ? = " + flag_success);

        //add elements by add() method; with generation exception;
        try{
            myQueue.add(Day.THU);
            myQueue.add(Day.FRI);
            myQueue.add(Day.SUN);
        }catch (IllegalStateException e){
            e.printStackTrace();
        }
        //remove head of the queue:
        System.out.println("remove head of the queue: " + myQueue.peek());
        Day head = null;
        try{
            //to delete head using method remove();
            head = myQueue.remove();
            System.out.println("1) took " + head + " from queue");
            System.out.println("now new head is: " + myQueue.element());
        }catch (NoSuchElementException e){
            e.printStackTrace();
        }
        //to delete head using method pool();
        head = myQueue.poll();
        System.out.println("2) took " + head + " from queue");
        System.out.println("now new head is: " + myQueue.peek());

        //check if we have element in queue:
        System.out.println("Is queue contain such element (SUN): " + myQueue.contains(Day.SUN));
        System.out.println("Is queue contain such element (MON): " + myQueue.contains(Day.MON));

    }
}
 enum Day{
    MON, TUE, WED, THU, FRI, SAT, SUN
 }