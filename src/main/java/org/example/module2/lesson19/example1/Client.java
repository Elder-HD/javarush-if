package org.example.module2.lesson19.example1;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    private static int counter = 0;

    public static void main(String[] args) {
        boolean isWorking = true;
        int port = 8082;
        String host = "localhost";

        while (isWorking) {
            try (Socket clientSocket = new Socket(host, port);
                 OutputStream outputStream = clientSocket.getOutputStream();
                 DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            ) {

                Thread.currentThread().sleep(1_000);
                dataOutputStream.writeUTF("Hello server! From client: " + (counter++));


            } catch (IOException e) {
                System.out.println("exception: " + e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
