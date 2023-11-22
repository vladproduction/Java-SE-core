package vladproduction.com.Liskovs_substitution.exception_case;

import java.math.BigDecimal;

public class FixedTermDepositAccount extends Account {
    @Override
    protected void deposit(BigDecimal amount) {
        System.out.println("FixedTermDepositAccount.deposit();\n deposit success :" + amount);
    }

    @Override
    protected void withdraw(BigDecimal amount) {
        throw new UnsupportedOperationException("Withdrawals are not supported by FixedTermDepositAccount!!");
    }

}