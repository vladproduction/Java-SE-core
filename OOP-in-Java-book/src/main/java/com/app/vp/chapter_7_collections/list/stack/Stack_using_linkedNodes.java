package com.app.vp.chapter_7_collections.list.stack;

import java.util.EmptyStackException;

public class Stack_using_linkedNodes {

    // Class representing a stack with linked nodes
    public class Stack<E> {

        private Node<E> top; // Top node of the stack

        private static class Node<E> {
            private E data;
            private Node<E> next;

            public Node(E data) {
                this.data = data;
            }
        }

        public void push(E element) {
            Node<E> newNode = new Node<>(element);
            newNode.next = top;
            top = newNode;
        }

        public E pop() {
            if (isEmpty()) {
                throw new EmptyStackException(); // Handle empty stack
            }
            E data = top.data;
            top = top.next;
            return data;
        }

        public E peek() {
            if (isEmpty()) {
                return null;
            }
            return top.data;
        }

        public boolean isEmpty() {
            return top == null;
        }
    }
}
