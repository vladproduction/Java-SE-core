package vladproduction.com.Liskovs_substitution.exception_case;

import java.math.BigDecimal;

public class BankingAppWithdrawalService {
    private final Account account;

    public BankingAppWithdrawalService(Account account) {
        this.account = account;
    }

    public void withdraw(BigDecimal amount) {
        account.withdraw(amount);
    }

    public static void main(String[] args) {

        Account myFixedTermDepositAccount = new FixedTermDepositAccount();
        myFixedTermDepositAccount.deposit(new BigDecimal("1000.00"));

        BankingAppWithdrawalService withdrawalService =
                new BankingAppWithdrawalService(myFixedTermDepositAccount);
        withdrawalService.withdraw(new BigDecimal("100.00"));
    }
}