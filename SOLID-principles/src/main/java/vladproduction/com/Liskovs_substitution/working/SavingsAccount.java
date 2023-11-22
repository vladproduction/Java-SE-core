package vladproduction.com.Liskovs_substitution.working;

import java.math.BigDecimal;

public class SavingsAccount extends WithdrawalAccount{

    @Override
    public void deposit(BigDecimal amount) {
        super.deposit(amount);
        System.out.println("\toperation success: " + amount);
    }

    @Override
    public void withdraw(BigDecimal amount) {
        super.withdraw(amount);
        System.out.println("\toperation success: " + amount);
    }
}
