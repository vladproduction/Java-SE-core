package com.vladproduction.assignment5;

public class Main {
    public static void main(String[] args) {

        EventAction action1 = new Message("=1=");
        EventAction action2 = new Payment("=2=");
        EventAction action3 = new Password("=3=");

        EventAction[] eventActions = {action1, action2, action3};

        for (int i = 1; i < 4; i++) {
            try {
                Thread.sleep(3000);
                actions(eventActions, i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    private static void actions(EventAction[] eventActions, int step) {
        System.out.println("Stage: " + step);
        for (EventAction eventAction : eventActions) {
            System.out.println(eventAction.getTimeStamp());
            eventAction.process();
            step++;
        }
        System.out.println("==============");
    }
}
