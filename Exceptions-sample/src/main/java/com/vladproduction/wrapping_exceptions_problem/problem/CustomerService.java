package com.vladproduction.wrapping_exceptions_problem.problem;

public class CustomerService {

    public void persistCustomer(Customer c) throws PersistenceException {
        // Simulating persistence logic that might throw a PersistenceException
        throw new PersistenceException("Failed to persist customer", 1001);
    }

    public void manageCustomer(Customer c) throws BusinessException {
        try {
            persistCustomer(c);
        } catch (PersistenceException ex) {
            throw new BusinessException(ex, ex.getCode());
        }
    }

    public void createCustomer(Customer c) throws ApiException {
        try {
            manageCustomer(c);
        } catch (BusinessException ex) {
            throw new ApiException(ex, ex.getCode());
        }
    }
    
    public static void main(String[] args) {
        CustomerService service = new CustomerService();
        Customer customer = new Customer(); // assuming a Customer class is defined

        try {
            service.createCustomer(customer);
        } catch (ApiException ex) {
            System.err.println("Error: " + ex.getMessage());
            // Optionally log the cause or handle it further
        }
    }
}