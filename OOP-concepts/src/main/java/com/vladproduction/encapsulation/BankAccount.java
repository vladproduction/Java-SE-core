package com.vladproduction.encapsulation;

public class BankAccount {

    // Private fields - not accessible directly from outside
    private String accountHolder;
    private String accountNumber;
    private double balance;
    private String pin;

    public BankAccount(String accountHolder, String accountNumber, String pin) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.pin = pin;
    }

    // Public methods to access private fields
    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // No getter for PIN - security measure

    //Controlled access to modify balance:
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " $, to " + accountNumber);
        }
        else {
            System.out.println("Cannot deposit " + amount + " $, to " + accountNumber);
            System.out.println("Invalid amount to deposit " + amount);
            System.out.println("Balance: " + balance);
        }
    }

    public boolean withdraw(double amount, String enterPin) {
        if(!pin.equals(enterPin)) {
            System.out.println("Cannot withdraw");
            System.out.println("Invalid pin to withdraw " + enterPin);
        }
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " $, to " + accountNumber);
            return true;
        }
        else {
            System.out.println("Invalid withdrawal amount or insufficient funds");
            return false;
        }
    }

    // Pin can only be changed if old pin is provided
    public boolean changePin(String oldPin, String newPin) {
        if (this.pin.equals(oldPin)) {
            this.pin = newPin;
            System.out.println("PIN changed successfully");
            return true;
        } else {
            System.out.println("Incorrect old PIN");
            return false;
        }
    }


}
