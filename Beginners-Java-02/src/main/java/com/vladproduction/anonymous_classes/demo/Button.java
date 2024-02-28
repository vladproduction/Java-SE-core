package com.vladproduction.anonymous_classes.demo;

public class Button {

    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void click(){
        if (clickListener != null){
            clickListener.onClick("Button clicked!");
        }
    }
}
