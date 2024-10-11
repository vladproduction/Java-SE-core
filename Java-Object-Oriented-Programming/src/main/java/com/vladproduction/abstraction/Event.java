package com.vladproduction.abstraction;

public interface Event {

    Long getTimeStamp();
    void process();

}
