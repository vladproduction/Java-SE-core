package vladproduction.com.Interface_segregation.violate;

import java.util.List;

public interface Payment {
    void initiatePayments();
    Object status();
    List<Object> getPayments();

    //could be lot more methods... and all of them we have to implement
}