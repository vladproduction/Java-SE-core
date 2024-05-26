package com.app.vp.chapter_7_collections.set.treeset;

/**
 * Model class for class TreeSet_comparator
 * */
public class PhoneBookEntry {

    private String name;
    private String address;
    private String phone;

    public PhoneBookEntry(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object object) {
        if(!(object instanceof PhoneBookEntry)){
            return false;
        }
        return this.name.equalsIgnoreCase(((PhoneBookEntry) object).name);
    }

    @Override
    public int hashCode() {
        return name.length();
    }

    @Override
    public String toString() {
        return name;
    }
}
