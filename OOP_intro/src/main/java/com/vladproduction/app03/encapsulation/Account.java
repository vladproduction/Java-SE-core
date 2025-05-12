package com.vladproduction.app03.encapsulation;

public class Account {

    private String user;
    private int accountNumber;
    private double balance;

    public Account(String user, int accountNumber, double balance) {
        this.user = user;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
