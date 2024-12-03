package com.vladproduction.wrapping_exceptions_problem.solution;

/**
 * This design avoids unnecessary wrapping by allowing PersistenceException to propagate directly within its own context
 * while still allowing other layers of the application to manage it appropriately through business logic exceptions.
 * This keeps exception management clear and concise.
 * */
public class CustomerService {

    public void persistCustomer(Customer c) throws PersistenceException {
        // Simulated persistence logic that might throw a PersistenceException
        throw new PersistenceException("Failed to persist customer");
    }

    public void manageCustomer(Customer c) throws PersistenceException {
        persistCustomer(c);  // Let the PersistenceException propagate without wrapping
    }

    public void createCustomer(Customer c) throws BusinessException {
        try {
            manageCustomer(c);
        } catch (PersistenceException ex) {
            // Handle the persistence issue appropriately here
            throw new BusinessException("Business logic error while managing customer", ex);
        }
    }

    public static void main(String[] args) {
        CustomerService service = new CustomerService();
        Customer customer = new Customer(); // assuming a Customer class is defined

        try {
            service.createCustomer(customer);
        } catch (BusinessException ex) {
            System.err.println("Business error: " + ex.getMessage());
            ex.printStackTrace(); // Log or handle specific business errors
        }
    }
}