package com.vladproduction.collections_framework_03;

import java.util.ArrayList;
import java.util.List;

// Custom Collection Class
class MyCustomCollection<T> {
    private List<T> elements;

    public MyCustomCollection() {
        elements = new ArrayList<>(); // Using ArrayList as the underlying structure
    }

    public void add(T element) {
        elements.add(element);
    }

    public T get(int index) {
        return elements.get(index);
    }

    public int size() {
        return elements.size();
    }

    @Override
    public String toString() {
        return elements.toString();
    }
}
