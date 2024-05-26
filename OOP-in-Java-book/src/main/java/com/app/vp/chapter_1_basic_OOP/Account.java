package com.app.vp.chapter_1_basic_OOP;

public class Account {

    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    //no setter for setAccountNumber() - unmodifiable

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * add particular amount to the balance
     * */
    public void credit(double amount){
        balance += amount;
    }

    /**
     * subtract particular amount to the balance, if it possible by validation
     * */
    public void debit(double amount){
        //if statement to track value of balance and amount
        if(balance < amount){
            System.out.println("The requested amount exceeds the current balance!");
        } else {
            balance -= amount;
        }

    }

    /**
     * overridden printing function in custom manner
     * */
    @Override
    public String toString() {

        return String.format("Account Number: %d, Balance: %.2f", accountNumber, balance);
    }
}
