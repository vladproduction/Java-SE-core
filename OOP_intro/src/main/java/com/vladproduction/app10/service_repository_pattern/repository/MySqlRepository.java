package com.vladproduction.app10.service_repository_pattern.repository;

import com.vladproduction.app10.service_repository_pattern.domain.MySqlUser;

import java.util.*;

/**
 * MySQL-specific implementation of the Repository interface.
 * Simulates interactions with a MySQL database.
 */
public class MySqlRepository implements Repository<MySqlUser, Long>{

    Map<Long, MySqlUser> usersTable = new HashMap<>();

    @Override
    public MySqlUser create(MySqlUser user) {
        System.out.println("MySQL: Creating user " + user.getUsername());
        usersTable.put(user.getSqlId(), user);
        return user;
    }

    @Override
    public Optional<MySqlUser> findById(Long id) {
        System.out.println("MySQL: Finding user by ID " + id);
        return Optional.ofNullable(usersTable.get(id));
    }

    @Override
    public List<MySqlUser> findAll() {
        System.out.println("MySQL: Retrieving all users");
        return new ArrayList<>(usersTable.values());
    }

    @Override
    public MySqlUser update(MySqlUser user) {
        System.out.println("MySQL: Updating user " + user.getUsername());
        if(usersTable.containsKey(user.getSqlId())){
            usersTable.put(user.getSqlId(), user);
            return user;
        }
        throw  new IllegalArgumentException("User with ID " + user.getSqlId() + " not found");
    }

    @Override
    public boolean deleteById(Long id) {
        System.out.println("MySQL: Deleting user with ID " + id);

        return usersTable.remove(id) != null;
    }

    @Override
    public String getDataSourceDetails() {
        return "MySQL Database Connection";
    }

    /**
     * MySQL-specific query method
     *
     * @param sql SQL query string
     * @return List of matching users
     */
    public List<MySqlUser> executeRawSql(String sql) {
        System.out.println("MySQL: Executing query: " + sql);
        return new ArrayList<>(usersTable.values());
    }


}














