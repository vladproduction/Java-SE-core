package com.vladproduction.app09.interface_driven_repo_service_design.repo;

import com.vladproduction.app09.interface_driven_repo_service_design.model.User;

public interface UserRepository {

    User getUser();
    void filterByAge(int age);


}
