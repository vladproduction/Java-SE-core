package vladproduction.com.Liskovs_substitution.working;

import java.math.BigDecimal;

public class FixedTermDepositAccount implements Account{
    @Override
    public void deposit(BigDecimal amount) {
        System.out.println("FixedTermDepositAccount.deposit();" +
                "\n operation success: " + amount);
    }

    public void withdraw(BigDecimal amount) {
        throw new UnsupportedOperationException(" No support" + amount);
    }
}
