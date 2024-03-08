package com.vladproduction.vp34_wildcards_generics.factory_mechanism;

/**
 * Created by vladproduction on 07-Mar-24
 */

public class Book<T> implements Product<String> {

    private final String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String getData() {
        return title;
    }
}
