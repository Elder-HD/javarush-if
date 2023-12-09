package org.example.module1.lesson9;

public class Example3 {
    public static void main(String[] args) {
        printWiFi("Wi-Fi",3); // printWiFi("Wi-Fi", 3);
    }

    public static void printWiFi(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}
