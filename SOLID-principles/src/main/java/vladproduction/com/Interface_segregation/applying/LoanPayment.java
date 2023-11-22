package vladproduction.com.Interface_segregation.applying;

import java.util.ArrayList;
import java.util.List;

public class LoanPayment implements Loan {

    @Override
    public void initiateLoanSettlement() {
        // ...
    }

    @Override
    public void initiateRePayment() {
        // ...
    }

    @Override
    public Object status() {
        return null;
    }

    @Override
    public List<Object> getPayments() {
        return new ArrayList<>();
    }
}