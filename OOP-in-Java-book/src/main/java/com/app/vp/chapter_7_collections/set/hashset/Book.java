package com.app.vp.chapter_7_collections.set.hashset;

/**
 * Model for testing HashSet class
 * */
public class Book {

    private  int id;
    private String title;

    //constructor
    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    //overridden equals();
    //books are equal if their id is the same;
    @Override
    public boolean equals(Object object){
        if(!(object instanceof Book)){
            return false;
        }
        else return this.id == ((Book)object).id;
    }

    //overridden hashcode()
    //books are equal if their hashCode is the same;
    @Override
    public int hashCode(){
        return id;
    }

    //overridden toString()
    @Override
    public String toString(){
        return id +":" + title;
    }

}
