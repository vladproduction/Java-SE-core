package com.vladproduction.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlingBlocksDemo {

    int balance;

    public static void main(String[] args) throws InsufficientFundsException {

        //try-catch
        try{
            int res = 10 / 0;
        }catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
            System.out.println("Cannot divide by zero");

        }

        //try-catch-finally
        FileReader reader = null;
        try {
            reader = new FileReader("file.txt");
            // Process file
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            // Always executed
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /*What happens when an exception is thrown in a finally block?
            - It replaces any exception thrown in the try block
            - Can lead to loss of original exception information*/


        /*try-with-resources (Java 7+)
        Automatically closes resources that implement AutoCloseable.*/
        try (FileReader reader2 = new FileReader("file.txt");
             BufferedReader br = new BufferedReader(reader2)) {
            String line = br.readLine();
            // Process file
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        // Resources automatically closed

        //Multiple catch blocks
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[10] / 0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception");
        } catch (Exception e) {
            System.out.println("General exception: " + e.getMessage());
        }

        //custom exception handling:

        ExceptionHandlingBlocksDemo ex = new ExceptionHandlingBlocksDemo();
        ex.balance = 180; //in case less than 10 we got an exception
        ex.withdraw(10);

        //does it possible to have just try without catch block?
        //Yes, if there's a finally block
        try{
            ex.withdraw(10);
        }finally {
            System.out.println("Balance after withdrawal: " + ex.balance);
        }

    }

    //throw and throws
    // throws declaration
    public void readFile(String filename) throws IOException {
        FileReader file = new FileReader(filename);
        // Process file
    }

    // throw keyword
    public void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }

    // Using custom exception
    public  void withdraw(int amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Not enough money");
        }
        balance -= amount;
    }
}
