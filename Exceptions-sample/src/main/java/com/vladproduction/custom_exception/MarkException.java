package com.vladproduction.custom_exception;

public class MarkException extends Exception{
    @Override
    public String getMessage(){
        return "Mark is not correct.";
    }
}
