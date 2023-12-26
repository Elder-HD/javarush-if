package org.example.module1.lesson16;

public class Example7 {
    public static void main(String[] args) {
        int counter = 0;
        byte[] items = new byte[10];

        byte[] newItems = new byte[20];

        for (int i = 0; i < items.length; i++) {
            newItems[i] = items[i];
        }

        items = newItems;
    }
}
