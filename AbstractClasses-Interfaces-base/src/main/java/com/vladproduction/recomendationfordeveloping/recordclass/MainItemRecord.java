package com.vladproduction.recomendationfordeveloping.recordclass;

/**
 * This type of record guarantees the immutability of the record field values and eliminates the need to create a
 * constructor, equals(Object), hashCode() and toString() methods, which are automatically generated for a record.
 * Instead of getters, methods with the field name are generated. In this case, these are name() and id().
 * */
public class MainItemRecord {
    public static void main(String[] args) {
        ItemRecord i1 = new ItemRecord("A", 10);
        System.out.println(i1.name() + " " + i1.id() + " " + i1); //A 10 ItemRecord[name=A, id=10]
        ItemRecord i2 = new ItemRecord("A", 10);
        System.out.println(i2.name() + " " + i2.id() + " " + i2); //A 10 ItemRecord[name=A, id=10]
        System.out.println((i1 == i2) + " " + i1.equals(i2) + " " + (i1.hashCode() == i2.hashCode()));//false true true
    }
}
record ItemRecord(String name, int id) {
    void method(){
    }
}
