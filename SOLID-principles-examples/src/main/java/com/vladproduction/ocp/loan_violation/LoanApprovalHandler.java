package com.vladproduction.ocp.loan_violation;

public class LoanApprovalHandler {

    public void approvePersonalLoan(PersonalLoanValidator validator){
        if(validator.isValid()){
            //process of the loan
        }
    }

    public void approveVehicleLoan(VehicleLoanValidator validator){
        if(validator.isValid()){
            //process of the loan
        }
    }


}
class PersonalLoanValidator {
    public boolean isValid() {
        //validation logic
        return true;
    }
}

class VehicleLoanValidator {
    public boolean isValid() {
        //validation logic
        return true;
    }
}