package com.vladproduction.dip.solution;


//Low level class


public class SimpleLogin implements Authentificator{

    @Override
    public boolean authentificate(User user) {
        return true;
    }
}
