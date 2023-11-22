package vladproduction.com.Interface_segregation.applying;

import java.util.ArrayList;
import java.util.List;

public class BankPayment implements Bank {

    @Override
    public void initiatePayments() {
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