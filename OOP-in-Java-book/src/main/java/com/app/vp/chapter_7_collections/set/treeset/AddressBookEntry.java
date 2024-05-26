package com.app.vp.chapter_7_collections.set.treeset;

/**
 * Model class with logic how to compare;
 * -implements Comparable<AddressBookEntry>;
 * */
public class AddressBookEntry implements Comparable<AddressBookEntry>{

    private String name;
    private String address;
    private String phone;

    public AddressBookEntry(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object object) {
        if(!(object instanceof AddressBookEntry)){
            return false;
        }
        return this.name.equalsIgnoreCase(((AddressBookEntry) object).name);
    }

    @Override
    public int hashCode() {
        return name.length();
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(AddressBookEntry o) {
        return this.name.compareToIgnoreCase(o.name);
    }
}
