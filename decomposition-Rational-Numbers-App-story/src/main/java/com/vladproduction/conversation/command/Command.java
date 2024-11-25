package com.vladproduction.conversation.command;

public abstract class Command {

    private final String tag;

    protected Command(final String tag){
        this.tag = tag;
    }

    public boolean hasTag(String s){
        return tag.equalsIgnoreCase(s);
    }

    public String getTag(){
        return tag;
    }

    public abstract void execute();

}
