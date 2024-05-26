package com.app.vp.chapter_7_collections.queue;

/**
 * Interface Deque is a doubly connected queue (a queue with two ends), i.e.
 * elements can be added and removed from both ends of the queue
 * (from the “head” and from the “tail”).
 * */
public interface DequeDemo {
    public static void main(String[] args) {
        /**
         * For Deque we have addition methods to work from both sides (head and tail):
         * 1)adding:
         * void addFirst(E e) - add element to the beginning of the deque;
         * void addLast(E e) - add element to the end of the deque;
         * boolean offerFirst(E e) - inserts an element to the beginning of the deque;
         * boolean offerLast(E e) - inserts an element to the end of the deque;
         *
         * 2)getting and remove:
         * E removeFirst() - get and delete first element; true-if success of opposite - false;
         * E removeLast() - get and delete last element; true-if success of opposite - false;
         * E poolFirst() - get and remove the first element of the deque; or null if deque is empty;
         * E poolLast() - get and remove the last element of the deque; or null if deque is empty;
         *
         * 2)getting but not remove:
         * E getFirst() - get and not remove the first element of the deque;
         * E getLast() - get and not remove the last element of the deque;
         * E peekFirst() - get and not remove the first element of the deque; or null if deque is empty;
         * E peekLast() - get and not remove the last element of the deque; or null if deque is empty;
         * */

        /**
         * The deque can be used as a queue organized
         * according to the FIFO principle (with the possibility of using add(e) methods,
         * remove(), element(), offer(e), poll(), peek()), or as a data structure,
         * organized according to the LIFO principle (last-in-fi rst-out - last
         * entered, first out) (with the possibility of using methods
         * push(e), pop(), peek()).
         * */
    }
}
