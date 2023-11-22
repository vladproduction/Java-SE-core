package vladproduction.com.Liskovs_substitution.working;

import java.math.BigDecimal;

public class BankingAppService {

    //todo

    private  WithdrawalAccount withdrawalAccount;
    private FixedTermDepositAccount fixedTermDepositAccount;

    public BankingAppService(FixedTermDepositAccount fixedTermDepositAccount) {
        this.fixedTermDepositAccount = fixedTermDepositAccount;
    }

    public BankingAppService(WithdrawalAccount withdrawalAccount) {
        this.withdrawalAccount = withdrawalAccount;
    }

    public void withdrawFixedTerm(BigDecimal amount) {
        fixedTermDepositAccount.withdraw(amount);
    }
    public void depositFixedTerm(BigDecimal amount) {
        fixedTermDepositAccount.deposit(amount);
    }

    public void withdraw(BigDecimal amount) {
        withdrawalAccount.withdraw(amount);
    }
    public void deposit(BigDecimal amount) {
        withdrawalAccount.deposit(amount);
    }
}