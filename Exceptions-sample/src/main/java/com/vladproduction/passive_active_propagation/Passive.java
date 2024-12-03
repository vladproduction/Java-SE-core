package com.vladproduction.passive_active_propagation;

public class Passive {
    public static void main(String[] args) {
        Passive passive = new Passive();
        passive.doJob();
    }
    public void doJob() throws RuntimeException {
        try {
            doJob2();
        } finally {
            //…
        }
    }
    public void doJob2() {
        throw new RuntimeException();
    }
}
