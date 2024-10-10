package com.vladproduction.assignment2;

/**
 * The BankAccount class encapsulates the owner and balance attributes.
 * The owner is immutable as there is no setter method, and it's stored as a String.
 * The balance can be modified through the deposit and withdraw methods.
 */
public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double startBalance) {
        this.owner = owner;
        this.balance = Math.max(startBalance, 0); //default value is '0' or starting balance in double
    }

    public String getOwner() {
        return owner;
    }
    public double getBalance() {
        return balance;
    }

    //bank account functions (deposit, withdraw)
    public double deposit(double amount){
        if(amount > 0.0){
            this.balance = this.balance + amount;
            return amount;
        }
        return 0.0;
    }

    public double withdraw(double amount){
        if(amount <= this.balance){
            this.balance = this.balance - amount;
        }
        return 0.0;
    }
}
