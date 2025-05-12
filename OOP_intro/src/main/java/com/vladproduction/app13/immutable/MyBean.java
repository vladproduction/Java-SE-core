package com.vladproduction.app13.immutable;

public final class MyBean {

    private final String[] data;

    public MyBean(String[] data) {
        this.data = data;
    }

    public String[] getData() {
        return data;
    }
}
