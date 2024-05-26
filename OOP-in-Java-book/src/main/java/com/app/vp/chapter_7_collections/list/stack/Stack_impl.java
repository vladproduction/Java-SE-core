package com.app.vp.chapter_7_collections.list.stack;

import java.util.Stack;

/**
 * Stack defined for the data structure "stack" organized according to the LIFO principle; //pringles
 * -inherited from Vector;
 * -synchronized resizable array;
 * */
public class Stack_impl {
    public static void main(String[] args) {

        /**
         * Stack:
         *
         *      Constructor:
         * -Stack() created empty stack;
         *
         *      Methods:
         * -E void push(E element) – pushes the specified element to the top of the stack;
         * -E pop() – removes and returns an element from the top of the stack;
         * -E peek() – returns an element from the top of the stack without removing it;
         * -boolean empty() – checks if the stack is empty;
         * -int search(Object obj) – returns the distance from the specified object to the top of the stack
         * (from 1 for the top of the stack) or –1 if element not found;
         * */

        Stack<Integer> stack = new Stack<>();
        System.out.println("stack = " + stack);
        System.out.println("stack.isEmpty() = " + stack.isEmpty());

        //try pop for empty stack:
//        Integer pop = stack.pop();
//        System.out.println("pop = " + pop); //expected: EmptyStackException

        //pushing elements to the stack:
        stack.push(100);
        stack.push(101);
        stack.push(102);
        stack.push(103);
        System.out.println("stack after push 4 elements = " + stack);

        //now we can try to pop (remove  and can return topper element)
        Integer pop = stack.pop();
        System.out.println("pop = " + pop); //LIFO principle: expected '103'

        //check the elements in stack after pop:
        System.out.println("stack after pop = " + stack);

        //searching for element '101':
        int searched = stack.search(101);
        System.out.println("searched index of element (101)= " + searched);

        //check again if stack is empty?
        boolean stackEmpty = stack.isEmpty();
        System.out.println("stackEmpty ? = " + stackEmpty);

        //check size()
        int size = stack.size();
        System.out.println("stack.size() = " + size);


    }
}