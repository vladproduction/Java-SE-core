package com.vladproduction.inheritance;

import java.util.Stack;

public class StackExampleInheritance {
    public static void main(String[] args) {

        Stack<Character> characterStack = new Stack<>();
        characterStack.push('c'); //put
        characterStack.push('a');
        characterStack.push('t');

        System.out.println(characterStack.pop()); //remove
        System.out.println(characterStack.pop());
        System.out.println(characterStack.pop());

        //t a c --> removed in reversed order (LIFO) last in first out

    }

}
