package com.vladproduction.dip.solution;


//High level class

public class LoginManager {

    Authentificator authentificator;

    public LoginManager(Authentificator authentificator) {
        this.authentificator = authentificator;
    }

    public void login(User user){
        authentificator.authentificate(user);
    }
}
