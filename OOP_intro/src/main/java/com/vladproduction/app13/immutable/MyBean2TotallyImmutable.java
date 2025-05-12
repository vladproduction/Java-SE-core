package com.vladproduction.app13.immutable;

public class MyBean2TotallyImmutable {

    private final String[] data;

    public MyBean2TotallyImmutable(String[] data) {
        this.data = new String[data.length];
        System.arraycopy(data, 0, this.data, 0, data.length);
    }

    public String[] getData() {
        String[] tmp = new String[this.data.length];
        System.arraycopy(this.data, 0, tmp, 0, this.data.length);
        return tmp;
    }
}
