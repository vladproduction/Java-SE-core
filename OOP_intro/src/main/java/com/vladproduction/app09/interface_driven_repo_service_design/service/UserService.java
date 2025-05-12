package com.vladproduction.app09.interface_driven_repo_service_design.service;

import com.vladproduction.app09.interface_driven_repo_service_design.repo.UserRepository;

/**
 * Generic service with clear contract
 * */
public class UserService<T extends UserRepository> {

    private final T repo;

    public UserService(T repo) {
        this.repo = repo;
    }

    public void checkUserAge(int age) {
        repo.getUser(); // just to simulate usage
        repo.filterByAge(age);
    }
}
