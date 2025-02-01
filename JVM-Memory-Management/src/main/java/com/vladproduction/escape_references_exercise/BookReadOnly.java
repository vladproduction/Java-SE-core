package com.vladproduction.escape_references_exercise;

public interface BookReadOnly {

    int getId();

    String getTitle();

    String getAuthor();

    @Override
    String toString();

    //todo: remove escaping reference
    //fixed: price is now immutable
    Price getPrice();
}
