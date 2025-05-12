package com.vladproduction.app10.service_repository_pattern.repository;

import java.util.List;
import java.util.Optional;

/**
 * Generic repository interface defining standard CRUD operations.
 * Uses Java 8's Optional for safer null handling.
 *
 * @param <T> The entity type this repository manages
 * @param <ID> The type of the entity's identifier
 */
public interface Repository<T, ID> {

    /**
     * Create a new entity in the data store
     *
     * @param entity Entity to be created
     * @return The created entity, possibly with generated ID
     */
    T create(T entity);

    /**
     * Find an entity by its ID
     *
     * @param id The entity's ID
     * @return The entity if found, otherwise empty
     */
    Optional<T> findById(ID id);

    /**
     * Retrieve all entities from the data store
     *
     * @return List of all entities
     * */
    List<T> findAll();

    /**
     * Update an existing entity in the data store
     *
     * @param entity The entity to be updated
     * */
    T update(T entity);

    /**
     * Delete an entity from the data store
     *
     * @param id The entity's ID
     * @return true if the entity was deleted, otherwise false
     * */
    boolean deleteById(ID id);

    /**
     * Get information about the data source used by this repository
     *
     * @return String representing the data source
     * */
    String getDataSourceDetails();


}







