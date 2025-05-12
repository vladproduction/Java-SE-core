package com.vladproduction.app10.service_repository_pattern.repository;

import com.vladproduction.app10.service_repository_pattern.domain.MongoDBUser;

import java.util.*;

/**
 * MongoDB-specific implementation of the Repository interface.
 * Simulates interactions with a MongoDB database.
 */
public class MongoDBRepository implements Repository<MongoDBUser, String>{

    private final Map<String, MongoDBUser> usersCollection = new HashMap<>();

    @Override
    public MongoDBUser create(MongoDBUser user) {
        System.out.println("MongoDB: Creating user " + user.getUsername());
        usersCollection.put(user.getMongoDBId(), user);
        return user;
    }

    @Override
    public Optional<MongoDBUser> findById(String id) {
        System.out.println("MongoDB: Finding user by ID " + id);
        return Optional.ofNullable(usersCollection.get(id));
    }

    @Override
    public List<MongoDBUser> findAll() {
        System.out.println("MongoDB: Retrieving all users");
        return new ArrayList<>(usersCollection.values());
    }

    @Override
    public MongoDBUser update(MongoDBUser user) {
        System.out.println("MongoDB: Updating user " + user.getUsername());
        if(usersCollection.containsKey(user.getMongoDBId())){
            usersCollection.put(user.getMongoDBId(), user);
            return user;
        }
        throw  new IllegalArgumentException("User with ID " + user.getMongoDBId() + " not found");
    }

    @Override
    public boolean deleteById(String id) {
        System.out.println("MongoDB: Deleting user with ID " + id);

        return usersCollection.remove(id) != null;
    }

    @Override
    public String getDataSourceDetails() {
        return "MongoDB Database Connection";
    }

    /**
     * MongoDB-specific query method
     *
     * @param query MongoDB query string
     * @return List of matching users
     */
    public List<MongoDBUser> findByMongoQuery(String query) {
        System.out.println("MongoDB: Executing query: " + query);
        return new ArrayList<>(usersCollection.values());
    }

}
























