package com.app.vp.chapter_7_collections.list.stack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack_using_ArrayList {
    // Class representing a stack using ArrayList
    public class Stack<E> {

        private ArrayList<E> elements;

        public Stack() {
            elements = new ArrayList<>();
        }

        public void push(E element) {
            elements.add(element);
        }

        public E pop() {
            if (isEmpty()) {
                throw new EmptyStackException(); // Handle empty stack
            }
            return elements.remove(elements.size() - 1);
        }

        public E peek() {
            if (isEmpty()) {
                return null;
            }
            return elements.get(elements.size() - 1);
        }

        public boolean isEmpty() {
            return elements.isEmpty();
        }
    }
}
