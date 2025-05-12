package com.vladproduction.app08.interface_basic_construction;

public class UserRepo implements Repository<User>{


    @Override
    public User create(User obj) {
        return null;
    }

    @Override
    public User read() {
        return null;
    }

    @Override
    public User update(User candidate, User old) {
        return null;
    }

    @Override
    public void delete() {

    }
}
