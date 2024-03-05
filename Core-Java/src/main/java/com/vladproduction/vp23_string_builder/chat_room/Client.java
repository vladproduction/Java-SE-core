package com.vladproduction.vp23_string_builder.chat_room;

public class Client implements Runnable {

    private final String name;
    private final ChatRoom chatRoom;

    public Client(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            String message = "Message " + (i + 1) + " from " + name;
            chatRoom.addMessage(message, name);
            try {
                Thread.sleep(1000); // Simulate delay between messages
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        Client client1 = new Client("Alice", chatRoom);
        Client client2 = new Client("Bob", chatRoom);

        new Thread(client1).start();
        new Thread(client2).start();

        // Wait for clients to finish sending messages
        try {
            Thread.sleep(5000); // Adjust sleep time as needed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Chat Log:");
        System.out.println(chatRoom.getChatLog());
    }
}