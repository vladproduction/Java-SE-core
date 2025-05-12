package com.vladproduction.app09.interface_driven_repo_service_design.repo;

import com.vladproduction.app09.interface_driven_repo_service_design.model.User;
import com.vladproduction.app09.interface_driven_repo_service_design.model.UserImpl;

public class MySqlDBRepositoryImpl implements UserRepository {

    private final User user;

    public MySqlDBRepositoryImpl(String name, int age) {
        this.user = new UserImpl(name, age);
    }

    @Override
    public User getUser() {
        System.out.println("MySQL: Getting user...");
        return user;
    }

    @Override
    public void filterByAge(int age) {
        boolean match = user.age() == age;
        System.out.println("MySQL: Age match? " + match);
    }
}
