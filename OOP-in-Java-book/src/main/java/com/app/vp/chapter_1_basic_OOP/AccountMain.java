package com.app.vp.chapter_1_basic_OOP;

/**
 * Testing Account class
 * */
public class AccountMain {
    public static void main(String[] args) {
        //init Accounts and check how constructors work
        Account acc1 = new Account(123, 99.9);
        Account acc2 = new Account(555);

        //how toString() work
        System.out.println("acc1 = " + acc1);
        System.out.println("acc2 = " + acc2);

        //check setters and getters
        acc1.setBalance(1000);
        System.out.println(acc1); //check if our account has been changed
        System.out.println("Account Number: " + acc1.getAccountNumber()); //getter for getAccountNumber()
        System.out.println("Balance = " + acc1.getBalance()); //getter for getBalance()

        //check methods: credit, debit
        acc1.credit(500); //invoke credit
        System.out.println(acc1);
        acc1.debit(1200);//invoke debit
        System.out.println(acc1);

        //error expected scenario
        acc1.debit(2000);
        System.out.println(acc1);
    }
}
