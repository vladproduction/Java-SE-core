package com.vladproduction.app08.interface_basic_construction;

public interface Repository<T> {

    T create(T obj);
    T read();
    T update(T candidate, T old);
    void delete();
}
