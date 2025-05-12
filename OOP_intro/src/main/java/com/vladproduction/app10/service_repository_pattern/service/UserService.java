package com.vladproduction.app10.service_repository_pattern.service;

import com.vladproduction.app10.service_repository_pattern.domain.User;
import com.vladproduction.app10.service_repository_pattern.repository.Repository;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Generic service layer for user operations.
 * Demonstrates separation of concerns, dependency injection, and business logic handling.
 *
 * @param <T> The specific User type this service handles
 * @param <ID> The type of the user's identifier
 */
public class UserService<T extends User, ID> {

    private final Repository<T, ID> repository;

    /**
     * Constructor-based dependency injection
     *
     * @param repository The repository this service will use
     */
    public UserService(Repository<T, ID> repository) {
        this.repository = repository;
    }

    /**
     * Business logic to filter users by minimum age
     *
     * @param minimumAge The minimum age to filter by
     * @return List of users meeting the age criteria
     */
    public List<T> getUsersByMinimumAge(int minimumAge){
        System.out.println("Filtering users by minimum age: " + minimumAge);
        System.out.println("Using Data Source: " + repository.getDataSourceDetails());

        return repository.findAll().stream()
                .filter(user -> user.getAge() >= minimumAge)
                .collect(Collectors.toList());
    }

    /**
     * Register a new user
     *
     * @param user User to register
     * @return The registered user
     */
    public T registerUser(T user){
        System.out.println("Registering new user: " + user.getUsername());
        //business logic to validate user data, etc.
        if(user.getUsername() == null || user.getUsername().isEmpty()){
            throw new IllegalArgumentException("Username cannot be empty");
        }
        if(user.getUsername().length() < 3){
            throw new IllegalArgumentException("Username must be at least 3 characters long");
        }
        if(user.getAge() < 0){
            throw new IllegalArgumentException("Age cannot be negative");
        }
        return repository.create(user);
    }

    /**
     * Get all users in the system
     *
     * @return List of all users
     */
    public List<T> getAllUsers(){
        System.out.println("Retrieving all users in the system.");
        return repository.findAll();
    }

    /**
     * Get repository information
     *
     * @return Repository details
     */
    public String getRepositoryDetails(){
        System.out.println("Using Data Source (repository details): ");
        return repository.getDataSourceDetails();
    }

}




















