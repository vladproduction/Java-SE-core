package vladproduction.com.Interface_segregation.applying;

public interface Loan extends Payment {
    void initiateLoanSettlement();
    void initiateRePayment();
}