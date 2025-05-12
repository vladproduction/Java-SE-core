package com.vladproduction.app12.covariant;

public class SimpleWorker extends Worker{

    @Override
    public B work(){
        return new B();
    }

}
