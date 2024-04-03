package org.example.module2.lesson19.example1;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        boolean isWorking = true;
        int port = 8082;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            serverSocket.setSoTimeout(100_000);
            while (isWorking) {
                try (Socket listenedSocket = serverSocket.accept();
                     InputStream inputStream = listenedSocket.getInputStream();
                     DataInputStream dataInputStream = new DataInputStream(inputStream)
                ) {
                    String message = dataInputStream.readUTF();
                    System.out.println("Message: " + message);
                }

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
