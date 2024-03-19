package com.vladproduction.vp48_enum;

/**
 * Created by vladproduction on 19-Mar-24
 */

public enum Animal {
    DOG("dog running fast"),
    CAT("cat jumping high"),
    BIRD("bird can fly");

    private String message;
    Animal(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return message;
    }
}
