package com.vladproduction;

public interface AccountManager {

//    @BankingAnnotation(securityLevel = SecurityLevelType.HIGH)
    double depositInCash(int accountId, int amount);

//    @BankingAnnotation(securityLevel = SecurityLevelType.HIGH)
    boolean withdraw(int accountId, int amount);

    // run again without comment
    // @BankingAnnotation(securityLevel = SecurityLevelType.LOW)
    boolean convert(double amount);

//    @BankingAnnotation // default value MEDIUM
    public boolean transfer(int accountId, double amount);

}
