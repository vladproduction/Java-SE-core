package com.vladproduction.cohesion;

import java.util.List;

// Email operations - High cohesion class focusing only on email-related operations
public class EmailService {

    private String smtpServer;
    private int port;
    private String senderEmail;

    public EmailService(String smtpServer, int port, String senderEmail) {
        this.smtpServer = smtpServer;
        this.port = port;
        this.senderEmail = senderEmail;
    }

    public void sendEmail(String recipient, String subject, String body) {
        System.out.println("Connecting to SMTP server: " + smtpServer + ":" + port);
        System.out.println("From: " + senderEmail);
        System.out.println("To: " + recipient);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
        // In a real system, this would connect to an email service
    }

    public void sendBulkEmail(List<String> recipients, String subject, String body) {
        System.out.println("Sending bulk email to " + recipients.size() + " recipients");
        for (String recipient : recipients) {
            sendEmail(recipient, subject, body);
        }
    }

}
