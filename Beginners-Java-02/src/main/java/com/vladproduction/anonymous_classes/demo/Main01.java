package com.vladproduction.anonymous_classes.demo;

public class Main01 {
    public static void main(String[] args) {

        Button button = new Button();

        button.setClickListener(new ClickListener() {
            @Override
            public void onClick(String message) {
                System.out.println(message);
            }
        });

        button.click(); //Button clicked!

    }
}
