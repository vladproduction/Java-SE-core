package com.vladproduction.vp39_checked_unchecked.checked;

/**
 * Created by vladproduction on 18-Mar-24
 */

public class Forced_Error {

    /**public class AccountService {

     public void transferFunds(Account fromAccount, Account toAccount, double amount) throws InsufficientFundsException {
     if (fromAccount.getBalance() < amount) {
     throw new InsufficientFundsException("Insufficient funds in source account");
     }

     // Code to perform actual transfer (assuming it modifies account balances)
     fromAccount.withdraw(amount);
     toAccount.deposit(amount);
     }
     }

     public class Main {

     public static void main(String[] args) {
     Account fromAccount = new Account(100);
     Account toAccount = new Account(0);

     try {
     AccountService service = new AccountService();
     service.transferFunds(fromAccount, toAccount, 150); // This will throw InsufficientFundsException
     } catch (InsufficientFundsException e) {
     System.err.println("Transfer failed: " + e.getMessage());
     // Handle insufficient funds scenario (e.g., inform user, retry with lower amount)
     }
     }
     }

     class InsufficientFundsException extends Exception {
     public InsufficientFundsException(String message) {
     super(message);
     }
     }*/

    /**Benefits:

     Checked exceptions like InsufficientFundsException force the caller to address a critical error.
     This prevents the program from crashing silently in case of insufficient funds.
     It encourages writing code that explicitly deals with possible error scenarios, leading to more robust applications.*/
}
