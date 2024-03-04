package com.vladproduction.vp08_do_while;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
//        simpleWhile();
        simpleDoWhile();
    }

    protected static void simpleWhile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter '5': ");
        int value = scanner.nextInt();
        while (value != 5) {
            System.out.println("need to type '5'");
            value = scanner.nextInt();
        }
        System.out.println("Perfect!");
    }

    protected static void simpleDoWhile() {
        Scanner scanner = new Scanner(System.in);
        int value;
        do {
            System.out.println("Press '5': ");
            value = scanner.nextInt();
        }
        while (value != 5);
        System.out.println("Perfect!");

    }
}
