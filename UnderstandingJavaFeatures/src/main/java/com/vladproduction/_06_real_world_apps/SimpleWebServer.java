package com.vladproduction._06_real_world_apps;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleWebServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("Server started and listening on port: 8080");

        while (true) {
            Socket clientSocket = serverSocket.accept();
            new Thread(new ClientHandler(clientSocket)).start();
        }
        //print on browser: http://localhost:8080/
        //and get response: Hello, World!

    }
}
