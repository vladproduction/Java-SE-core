package vladproduction.com.Liskovs_substitution.exception_case;

import java.math.BigDecimal;

public abstract class Account {
    protected abstract void deposit(BigDecimal amount);

    protected abstract void withdraw(BigDecimal amount);
}
