package com.app.vp.chapter_7_collections.queue;

/**
 * Interface Queue is a Collection where elements add and remove by principle FIFO;
 * The basic methods of the Queue<E> interface include adding
 * element, retrieving and removing the first element on transition
 * to the next one or retrieving the first element without deleting it;
 *
 * */
public interface QueueDemo {
    public static void main(String[] args) {
        /**
         * In addition to the basic Collection<E> methods, for the Queue<E> additional inclusion, extraction methods are provided
         * and control. Each of these methods exists in two forms − in one case, an exception is generated if an error
         * occurred during the execution of the method; in the second case, a special value is returned
         * (either null or false, depending on the method).
         * */

        //Methods:

        /**
         * 1) add to the end of queue:
         * boolean add(E e) - generate exception in case of incorrect :
                             *  -addition of element;
                             *  -addition to the wrong place;
                             *  -addition at wrong time;
         * boolean offer(E e) - true if added; or false if not;
         *
         * 2) get element from the head (from the beginning of the queue):
         * E remove() - NoSuchElementException, if queue is empty;
         * E pool() - get and remove the head of the queue; or null if queue is empty;
         *
         * 3)Checking (get element from head but not remove):
         * E element() - NoSuchElementException, if queue is empty;
         * E peek() - get and not remove the head of the queue; or null if queue is empty;
         * */
    }
}
