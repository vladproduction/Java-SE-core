package vladproduction.com.Interface_segregation.violate;

import java.util.ArrayList;
import java.util.List;

public class BankPayment implements Payment {

    @Override
    public void initiatePayments() {
        System.out.println("initiatePayments()");

    }

    @Override
    public Object status() {
        Object object = new Object();
        String simpleName = object.getClass().getSimpleName();
        object += simpleName;
        return "#" + object;
    }

    @Override
    public List<Object> getPayments() {
        return new ArrayList<>();
    }
}