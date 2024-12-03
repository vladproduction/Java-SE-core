package com.vladproduction;

/**
 * In this example, the methods of the system logic class perform actions on a bank account.
 * Depending on various reasons, specific implementations of the AccountManager interface may need additional
 * actions beyond the basic ones. Let's consider an example of annotating methods.
 * */
public class AccountManagerImpl implements AccountManager {
    @BankingAnnotation(securityLevel = SecurityLevelType.HIGH)
    public double depositInCash(int accountId, int amount) {
        System.out.println("deposit in total: " + amount );
        return 0;
    }
    @BankingAnnotation(securityLevel = SecurityLevelType.HIGH)
    public boolean withdraw(int accountId, int amount) {
        System.out.println("amount withdrawn: " + + amount);
        return true;
    }
    // run again without comment
    // @BankingAnnotation(securityLevel = SecurityLevelType.LOW)
    public boolean convert(double amount) {
        System.out.println("amount converted: " + amount);
        return true;
    }
    @BankingAnnotation // default value MEDIUM
    public boolean transfer(int accountId, double amount) {
        System.out.println("amount transferred: " + amount);
        return true;
    }
}