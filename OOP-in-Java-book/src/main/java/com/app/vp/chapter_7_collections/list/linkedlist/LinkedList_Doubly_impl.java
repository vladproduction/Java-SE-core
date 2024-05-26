package com.app.vp.chapter_7_collections.list.linkedlist;

public class LinkedList_Doubly_impl {

    public class DoublyLinkedList<E> {

        private Node<E> head; // Reference to the first node (head)
        private Node<E> tail; // Reference to the last node (tail)

        private static class Node<E> {
            private E data;
            private Node<E> next;
            private Node<E> prev;

            public Node(E data) {
                this.data = data;
            }
        }

        // Add a new element to the end of the list (tail)
        public void add(E data) {
            Node<E> newNode = new Node<>(data);
            if (isEmpty()) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }

        // Remove the first element from the list (head)
        public E removeFirst() {
            if (isEmpty()) {
//                throw new EmptyListException(); // Handle empty list
            }
            Node<E> removedNode = head;
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            return removedNode.data;
        }

        // Other methods for insertion at specific positions, removal by data, searching, etc. can be implemented similarly.

        public boolean isEmpty() {
            return head == null;
        }
    }

}
