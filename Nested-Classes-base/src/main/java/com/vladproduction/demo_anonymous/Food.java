package com.vladproduction.demo_anonymous;

public class Food {
    Popcorn p = new Popcorn() {
        public void sizzle() {
            System.out.println("anonymous sizzling popcorn");
        }

        public void pop() {
            System.out.println("anonymous popcorn");
        }
    };

    public static void main(String[] args) {
        Food food = new Food();
        food.p.pop();
        food.p.sizzle();
    }
}

class Popcorn {

    public void pop() {
        System.out.println("Popcorn pop() method call");
    }

    public void sizzle() {
    }
}
