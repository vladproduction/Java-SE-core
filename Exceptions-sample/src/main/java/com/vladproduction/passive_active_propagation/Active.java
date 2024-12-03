package com.vladproduction.passive_active_propagation;

public class Active {
    public static void main(String[] args) throws Exception { //here we add; and error gone
        Active active = new Active();
        active.doJob(); //need to add throwing Exception to method signature
    }
    public void doJob() throws Exception {
        try {
            doJob2();
        } catch (Exception e) {
            throw new Exception(e.getMessage() + "more info");
        } finally { /* ... */ }
    }
    public void doJob2() throws Exception {
        throw new Exception();
    }
}
