package com.vladproduction.vp23_string_builder.chat_room;

public class ChatRoom {

    private final StringBuffer chatLog = new StringBuffer();

    public synchronized void addMessage(String message, String sender) {
        chatLog.append(sender + ": " + message + "\n"); // Append message with sender and newline
        notifyAll(); // Notify waiting threads (optional)
    }

    public String getChatLog() {
        return chatLog.toString();
    }

}
