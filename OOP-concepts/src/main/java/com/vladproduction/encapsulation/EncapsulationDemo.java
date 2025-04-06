package com.vladproduction.encapsulation;

public class EncapsulationDemo {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("John Doe", "123456789", "1234");

        // Accessing data through public methods
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: $" + account.getBalance());

        // Cannot access private fields directly
        // System.out.println(account.balance); // Compile error
        // System.out.println(account.pin);     // Compile error

        // Using encapsulated methods
        account.deposit(1000);
        System.out.println("Current Balance: $" + account.getBalance());

        account.withdraw(500, "1234");
        System.out.println("Current Balance: $" + account.getBalance());

        account.withdraw(200, "wrong"); // Will fail due to incorrect PIN
        System.out.println("Current Balance: $" + account.getBalance());

        account.changePin("1234", "5678");
        account.withdraw(100, "5678"); // Will work with new PIN
        System.out.println("Final Balance: $" + account.getBalance());

    }
}
