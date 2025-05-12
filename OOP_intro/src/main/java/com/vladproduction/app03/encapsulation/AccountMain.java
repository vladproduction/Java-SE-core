package com.vladproduction.app03.encapsulation;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account("John", 123, 1000.0);

        System.out.println(account.getUser());
        System.out.println(account.getAccountNumber());
        System.out.println(account.getBalance());

        account.setBalance(account.getBalance() + 2000.0);
        System.out.print("New balance: " + account.getBalance()); // 3000.0

    }
}
