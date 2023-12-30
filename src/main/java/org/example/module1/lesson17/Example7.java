package org.example.module1.lesson17;

import java.util.ArrayList;

public class Example7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(String.valueOf(i));
        }
        int counter = 0;
        for (String s : list) {
            if (counter == 5) {
                list.add("blabla");
            }
            System.out.println(s);
            counter++;
        }
    }
}
