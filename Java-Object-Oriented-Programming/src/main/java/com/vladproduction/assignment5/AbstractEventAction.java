package com.vladproduction.assignment5;

import java.sql.Timestamp;

public abstract class AbstractEventAction implements EventAction{

    protected final Long timeStamp;
    protected final String id;

    public AbstractEventAction(String id) {
        this.timeStamp = new Timestamp(System.currentTimeMillis()).getTime();
        this.id = id;
    }

    @Override
    public Long getTimeStamp(){
        return this.timeStamp;
    }

    public abstract void process();
}


