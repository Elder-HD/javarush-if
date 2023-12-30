package org.example.module1.lesson17;

import java.util.ArrayList;
import java.util.Iterator;

public class Example6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(String.valueOf(i));
        }

        Iterator<String> iterator = list.iterator();
        list.add("________");

        System.out.println("=".repeat(100));
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
