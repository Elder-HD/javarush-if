package org.example.module1.lesson16;

import java.util.ArrayList;

public class Example8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("One");
        list.add("Two");

        //|One|Two|  |
        System.out.println(list.size());
        list.add(1, "3");
        //|One|3|Two|

        System.out.println(list.size());

        System.out.println(list.get(2));

        list.set(1,"blabla");

        System.out.println(list);

        list.clear();
        System.out.println(list.size());

        System.out.println(list.isEmpty());

        Object[] array = list.toArray();
    }
}
