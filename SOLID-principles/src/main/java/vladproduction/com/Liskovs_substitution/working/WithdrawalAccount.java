package vladproduction.com.Liskovs_substitution.working;

import java.math.BigDecimal;

public class WithdrawalAccount implements Account{
    @Override
    public void deposit(BigDecimal amount) {
        System.out.println("WithdrawalAccount.deposit()");
    }

    public void withdraw(BigDecimal amount) {
        System.out.println("WithdrawalAccount.withdraw()");

    }

}
