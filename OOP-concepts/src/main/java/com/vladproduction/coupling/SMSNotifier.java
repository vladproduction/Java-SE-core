package com.vladproduction.coupling;

public class SMSNotifier implements NotificationService {
    @Override
    public void sendNotification(String recipient, String subject, String message) {
        System.out.println("Sending SMS to: " + recipient);
        System.out.println("SMS Subject: " + subject);
        System.out.println("SMS Body: " + message);
    }
}