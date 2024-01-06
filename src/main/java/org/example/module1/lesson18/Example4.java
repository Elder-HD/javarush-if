package org.example.module1.lesson18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Example4 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= 10; i++) {
            map.put(i, i * i);
        }

        System.out.println(map.size());
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();

        System.out.println("=".repeat(100));
        for (Map.Entry<Integer, Integer> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
