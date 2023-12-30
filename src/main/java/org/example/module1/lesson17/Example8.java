package org.example.module1.lesson17;

import java.util.ArrayList;
import java.util.Iterator;

public class Example8 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(i);
        }

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next > 10) {
                iterator.remove();
            }
        }

        System.out.println(list);
    }
}
