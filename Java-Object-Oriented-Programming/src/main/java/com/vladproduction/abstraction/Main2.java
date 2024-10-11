package com.vladproduction.abstraction;

public class Main2 {
    public static void main(String[] args) {

        PasswordChangeEvent passwordChangeEvent = new PasswordChangeEvent("101");
        MissedPaymentEvent missedPaymentEvent = new MissedPaymentEvent("102");
        AccountTransferEvent accountTransferEvent = new AccountTransferEvent("103");

        Event[] events = {passwordChangeEvent, missedPaymentEvent, accountTransferEvent};

        for (Event event : events) {
            System.out.println(event.getTimeStamp());
            event.process();
            System.out.println();
        }

    }
}
